package com.example.voiture.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="imagevoiture")
public class ImageVoiture {
     
    @Id
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "idvoiture")
    private Voiture voiture;
    
    private String urlimage;

    // Constructeurs, getters, setters...

    public ImageVoiture() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public ImageVoiture(int id, String urlImage) {
        this.id = id;
        this.urlimage = urlImage;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture personne) {
        this.voiture = personne;
    }

    public String getUrlImage() {
        return urlimage;
    }

    public void setUrlImage(String email) {
        this.urlimage = email;
    }

}
