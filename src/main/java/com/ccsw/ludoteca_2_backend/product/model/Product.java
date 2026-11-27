package com.ccsw.ludoteca_2_backend.product.model;

import com.ccsw.ludoteca_2_backend.author.model.Author;
import com.ccsw.ludoteca_2_backend.category.model.Category;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "age", nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;

    @Column(name = "subcategory", nullable = false)
    private String subcategory;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Column(name = "cantidad", nullable = false)
    @Min(value = 0)
    private int cantidad;

    @Column(name = "image", nullable = false)
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

    public Category getCategory() {

        return this.category;
    }

    public void setCategory(Category category) {

        this.category = category;
    }

    public Author getAuthor() {

        return this.author;
    }

    public void setAuthor(Author author) {

        this.author = author;
    }

    public String getSubcategory() {
        return this.subcategory;
    }

    public void setSubcategory() {
        this.subcategory = subcategory;
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
