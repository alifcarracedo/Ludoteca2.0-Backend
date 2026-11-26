package com.ccsw.ludoteca_2_backend.category;

import com.ccsw.ludoteca_2_backend.category.model.Category;
import com.ccsw.ludoteca_2_backend.category.model.CategoryDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Category get(Long id) {

        return this.categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Category> findAll() {

        return (List<Category>) this.categoryRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, CategoryDto dto) {

        Category category;

        if (id == null) {
            category = new Category();
        } else {
            category = this.get(id);
        }

        category.setName(dto.getName());

        if (dto.getParentId() !=null) {
            if (id != null && id.equals(dto.getParentId())) {
                throw new RuntimeException("A category cannot be its own parent");
            }
            Category parent = this.get(dto.getParentId());
            if (id != null && isDescendant(category, parent.getId())) {
                throw new RuntimeException("Cannot assign a descendant as parent");
            }
            category.setParent(parent);

        } else {
            category.setParent(null);
        }
        this.categoryRepository.save(category);

    }


        private boolean isDescendant(Category category, Long possibleDescendantId) {
            for (Category subcategory : category.getSubcategories()) {
                if (subcategory.getId().equals(possibleDescendantId)) {
                    return true;
                }
                if (isDescendant(subcategory, possibleDescendantId)) {
                    return true;
                }
            }
            return false;
        }


    @Override
    public void delete(Long id) throws Exception {

        if (this.get(id) == null) {
            throw new Exception("Not exists");
        }

        this.categoryRepository.deleteById(id);
    }

}

