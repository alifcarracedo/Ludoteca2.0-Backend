package com.ccsw.ludoteca_2_backend.category.model;

import java.util.List;

/**
 * @author ccsw
 *
 */
public class CategoryDto {

    private Long id;

    private String name;
    private Long parentId;
    private List<CategoryDto> subcategories;

    /**
     * @return id
     */
    public Long getId() {

        return this.id;
    }

    /**
     * @param id new value of {@link #getId}.
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {

        return this.name;
    }

    /**
     * @param name new value of {@link #getName}.
     */
    public void setName(String name) {

        this.name = name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<CategoryDto> getSubcategories() {
        return this.subcategories;
    }
    public void setSubcategories(List<CategoryDto> subcategories) {
        this.subcategories = subcategories;
    }

}
