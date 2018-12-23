package com.JEI.Parapharmacie.Entities;

import javax.persistence.*;

@Entity
public class HomeInterfaceProduct {

    @Id @GeneratedValue
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public HomeInterfaceProduct(Long id, Product product) {
        this.id = id;
        this.product = product;
    }

    public HomeInterfaceProduct(Product product) {
        this.product = product;
    }

    public HomeInterfaceProduct() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "HomeInterfaceProduct{" +
                "id=" + id +
                ", product=" + product +
                '}';
    }
}
