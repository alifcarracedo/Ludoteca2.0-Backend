package com.ccsw.ludoteca_2_backend.product;

import com.ccsw.ludoteca_2_backend.common.criteria.SearchCriteria;
import com.ccsw.ludoteca_2_backend.product.model.Product;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;


public class ProductSpecification implements Specification<Product> {

    private static final long serialVersionUID = 1L;

    private final SearchCriteria criteria;

    public ProductSpecification(SearchCriteria criteria) {

        this.criteria = criteria;
    }

    @Override
    public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        if (criteria.getOperation().equalsIgnoreCase(":") && criteria.getValue() != null) {
            Path<String> path = getPath(root);
            if (path.getJavaType() == String.class) {
                return builder.like(path, "%" + criteria.getValue() + "%");
            } else {
                return builder.equal(path, criteria.getValue());
            }
        }
        return null;
    }

    private Path<String> getPath(Root<Product> root) {
        String key = criteria.getKey();
        String[] split = key.split("[.]", 0);

        Path<String> expression = root.get(split[0]);
        for (int i = 1; i < split.length; i++) {
            expression = expression.get(split[i]);
        }

        return expression;
    }

}