package com.ccsw.ludoteca_2_backend.category.model;

/**
 * @author ccsw
 *
 */
public class CategoryDto {

    private Long id;

    private String name;

    private String subcategory;

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

}
