package com.example.voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Voiture {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idmodele")
    private Modele modele;

    @ManyToOne
    @JoinColumn(name = "idtypecarburant")
    private TypeCarburant typecarburant;

    private int kilometrage;

    private String couleur;

    private Double prix;

    public Voiture() {
    }
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public TypeCarburant getTypeCarburant() {
        return typecarburant;
    }

    public void setTypeCarburant(TypeCarburant typeCarburant) {
        this.typecarburant = typeCarburant;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
