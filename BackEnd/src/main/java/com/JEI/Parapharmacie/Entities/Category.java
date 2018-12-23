package com.JEI.Parapharmacie.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Category {
    @ManyToMany(mappedBy = "categories")
    private List<Product> products ;
    @Id
    @GeneratedValue
    private Long id;
    private boolean inPromotion;
    private String longDescription;
    private String name;
    private int promotionPourcentage;
    private String shortDescription;

    public Category(List<Product> products, Long id, boolean inPromotion, String longDescription, String name, int promotionPourcentage, String shortDescription) {
        this.products = products;
        this.id = id;
        this.inPromotion = inPromotion;
        this.longDescription = longDescription;
        this.name = name;
        this.promotionPourcentage = promotionPourcentage;
        this.shortDescription = shortDescription;
    }

    public Category(List<Product> products, boolean inPromotion, String longDescription, String name, int promotionPourcentage, String shortDescription) {
        this.products = products;
        this.inPromotion = inPromotion;
        this.longDescription = longDescription;
        this.name = name;
        this.promotionPourcentage = promotionPourcentage;
        this.shortDescription = shortDescription;
    }

    public Category() {
        super();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isInPromotion() {
        return inPromotion;
    }

    public void setInPromotion(boolean inPromotion) {
        this.inPromotion = inPromotion;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromotionPourcentage() {
        return promotionPourcentage;
    }

    public void setPromotionPourcentage(int promotionPourcentage) {
        this.promotionPourcentage = promotionPourcentage;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "products=" + products +
                ", id=" + id +
                ", inPromotion=" + inPromotion +
                ", longDescription='" + longDescription + '\'' +
                ", name='" + name + '\'' +
                ", promotionPourcentage=" + promotionPourcentage +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}
