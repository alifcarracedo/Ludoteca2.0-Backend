package com.ccsw.ludoteca_2_backend.product.model;

import com.ccsw.ludoteca_2_backend.author.model.AuthorDto;
import com.ccsw.ludoteca_2_backend.category.model.CategoryDto;


public class ProductDto {

    private Long id;

    private String title;

    private Integer age;

    private CategoryDto category;

    private AuthorDto author;

    private String subcategory;

    private String description;

    private Integer cantidad;

    private String image;

    public Long getId() {

        return this.id;
    }


    public void setId(Long id) {

        this.id = id;
    }


    public String getTitle() {

        return this.title;
    }


    public void setTitle(String title) {

        this.title = title;
    }


    public int getAge() {

        return this.age;
    }


    public void setAge(int age) {

        this.age = age;
    }


    public CategoryDto getCategory() {

        return this.category;
    }


    public void setCategory(CategoryDto category) {

        this.category = category;
    }


    public AuthorDto getAuthor() {

        return this.author;
    }


    public void setAuthor(AuthorDto author) {

        this.author = author;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}