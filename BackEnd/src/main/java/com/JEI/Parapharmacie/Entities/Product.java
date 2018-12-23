package com.JEI.Parapharmacie.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Product {
    @Id @GeneratedValue
    private Long id ;
    @NotNull
    private double cost ;
    private boolean inPromotion ;
    private String longDescription ;
    @NotNull
    private String name ;
    private String picturePath ;
    private short promotionPourcentage ;
    private String shortDescription ;
    @ManyToMany
    private List<Category> categories ;

    public Product(Long id, @NotNull double cost, boolean inPromotion, String longDescription, @NotNull String name, String picturePath, short promotionPourcentage, String shortDescription, List<Category> categories) {
        this.id = id;
        this.cost = cost;
        this.inPromotion = inPromotion;
        this.longDescription = longDescription;
        this.name = name;
        this.picturePath = picturePath;
        this.promotionPourcentage = promotionPourcentage;
        this.shortDescription = shortDescription;
        this.categories = categories;
    }

    public Product(@NotNull double cost, boolean inPromotion, String longDescription, @NotNull String name, String picturePath, short promotionPourcentage, String shortDescription, List<Category> categories) {
        this.cost = cost;
        this.inPromotion = inPromotion;
        this.longDescription = longDescription;
        this.name = name;
        this.picturePath = picturePath;
        this.promotionPourcentage = promotionPourcentage;
        this.shortDescription = shortDescription;
        this.categories = categories;
    }

    public Product() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public short getPromotionPourcentage() {
        return promotionPourcentage;
    }

    public void setPromotionPourcentage(short promotionPourcentage) {
        this.promotionPourcentage = promotionPourcentage;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cost=" + cost +
                ", inPromotion=" + inPromotion +
                ", longDescription='" + longDescription + '\'' +
                ", name='" + name + '\'' +
                ", picturePath='" + picturePath + '\'' +
                ", promotionPourcentage=" + promotionPourcentage +
                ", shortDescription='" + shortDescription + '\'' +
                //", categories=" + categories +
                '}';
    }
}
