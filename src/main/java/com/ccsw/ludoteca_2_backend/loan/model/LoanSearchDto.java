package com.ccsw.ludoteca_2_backend.loan.model;

import com.ccsw.ludoteca_2_backend.common.pagination.PageableRequest;

import java.time.LocalDate;

/**
 * @author ccsw
 *
 */
public class LoanSearchDto {

    private PageableRequest pageable;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    private Long idProduct;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    private Long idClient;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date;

    public PageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PageableRequest pageable) {
        this.pageable = pageable;
    }

}
