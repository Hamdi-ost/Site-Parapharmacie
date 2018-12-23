package com.JEI.Parapharmacie.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HomeInterfaceImage {
    @Id @GeneratedValue
    private Long id ;
    private String imagePath ;

    public HomeInterfaceImage(Long id, String imagePath) {
        this.id = id;
        this.imagePath = imagePath;
    }

    public HomeInterfaceImage(String imagePath) {
        this.imagePath = imagePath;
    }

    public HomeInterfaceImage() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "HomeInterfaceImage{" +
                "id=" + id +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
