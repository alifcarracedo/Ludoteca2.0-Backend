package com.ccsw.ludoteca_2_backend.category;

import com.ccsw.ludoteca_2_backend.category.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ccsw
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
