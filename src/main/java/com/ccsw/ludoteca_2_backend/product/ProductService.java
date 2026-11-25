package com.ccsw.ludoteca_2_backend.product;

import com.ccsw.ludoteca_2_backend.product.model.Product;
import com.ccsw.ludoteca_2_backend.product.model.ProductDto;

import java.util.List;

public interface ProductService {

    List<Product> find(String title, Long idCategory);

    void save(Long id, ProductDto dto);

    Product get(Long id);
}
