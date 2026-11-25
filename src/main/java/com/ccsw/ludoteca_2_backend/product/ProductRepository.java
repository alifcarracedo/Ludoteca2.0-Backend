package com.ccsw.ludoteca_2_backend.product;

import com.ccsw.ludoteca_2_backend.product.model.Product;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    @Override
    @EntityGraph(attributePaths = {"category", "author"})
    List<Product> findAll(Specification<Product> spec);

}
