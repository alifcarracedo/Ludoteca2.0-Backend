package com.ccsw.ludoteca_2_backend.loan.model;

import com.ccsw.ludoteca_2_backend.client.model.ClientDto;
import com.ccsw.ludoteca_2_backend.product.model.ProductDto;

import java.time.LocalDate;

/**
 * @author ccsw
 *
 */
public class LoanDto {

    private Long id;

    private ProductDto product;

    private ClientDto client;

    private LocalDate startDate;

    private LocalDate endDate;

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
     * @return product
     */
    public ProductDto getProduct() {

        return this.product;
    }

    /**
     * @param product new value of {@link #getProduct}.
     */
    public void setProduct(ProductDto product) {

        this.product = product;
    }

    /**
     * @return client
     */
    public ClientDto getClient() {

        return this.client;
    }

    /**
     * @param client new value of {@link #getClient}.
     */
    public void setClient(ClientDto client) {

        this.client = client;
    }

    /**
     * @return startDate
     */
    public LocalDate getStartDate() {

        return this.startDate;
    }

    /**
     * @param startDate new value of {@link #getStartDate}.
     */
    public void setStartDate(LocalDate startDate) {

        this.startDate = startDate;
    }

    /**
     * @return endDate
     */
    public LocalDate getEndDate() {

        return this.endDate;
    }

    /**
     * @param endDate new value of {@link #getEndDate}.
     */
    public void setEndDate(LocalDate endDate) {

        this.endDate = endDate;
    }
}