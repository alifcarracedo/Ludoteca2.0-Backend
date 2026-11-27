package com.ccsw.ludoteca_2_backend.product;

import com.ccsw.ludoteca_2_backend.author.AuthorService;
import com.ccsw.ludoteca_2_backend.category.CategoryService;
import com.ccsw.ludoteca_2_backend.common.criteria.SearchCriteria;
import com.ccsw.ludoteca_2_backend.product.model.Product;
import com.ccsw.ludoteca_2_backend.product.model.ProductDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AuthorService authorService;

    @Autowired
    CategoryService categoryService;

    @Override
    public List<Product> find(String title, Long idCategory, String subcategory, Integer age) {

        ProductSpecification titleSpec = new ProductSpecification(new SearchCriteria("title", ":", title));
        ProductSpecification categorySpec = new ProductSpecification(new SearchCriteria("category.id", ":", idCategory));
        ProductSpecification subcategorySpec = new ProductSpecification(new SearchCriteria("subcategory", ":", subcategory));
        ProductSpecification ageSpec = new ProductSpecification(new SearchCriteria("age", ">", age));

        Specification<Product> spec = titleSpec.and(categorySpec).and(subcategorySpec).and(ageSpec);

        return this.productRepository.findAll(spec);
    }

    @Override
    public void save(Long id, ProductDto dto) {

        Product product;

        if (id == null) {
            product = new Product();
        } else {
            product = this.productRepository.findById(id).orElse(null);
        }

        BeanUtils.copyProperties(dto, product, "id", "author", "category", "subcategory", "cantidad");

        product.setAuthor(authorService.get(dto.getAuthor().getId()));
        product.setCategory(categoryService.get(dto.getCategory().getId()));

        this.productRepository.save(product);
    }

    @Override
    public Product get(Long id) {
        return null;
    }

}
