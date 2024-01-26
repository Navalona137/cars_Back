package com.example.voiture.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Favoris {
    @Id
    private int id;
    private int idannonce;
    private int iduser;

    // Constructeurs, getters, setters...

    public Favoris() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Favoris(int id, int idannonce, int iduser) {
        this.id = id;
        this.idannonce = idannonce;
        this.iduser = iduser;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnnonce() {
        return idannonce;
    }

    public void setIdAnnonce(int personne) {
        this.idannonce = personne;
    }

    public int getiduser() {
        return iduser;
    }

    public void setiduser(int email) {
        this.iduser = email;
    }

}
