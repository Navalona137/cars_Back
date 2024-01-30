package com.example.voiture.Front.Postgres.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Favoris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idvoiture;
    int iduser;

    public Favoris() {
    }
    public Favoris(int id, int idvoiture, int iduser) {
        this.id = id;
        this.idvoiture = idvoiture;
        this.iduser = iduser;

    }

    public int getId() {
        return id;
    }
    public int getIdvoiture() {
        return idvoiture;
    }
    public int getIduser(){
        return iduser;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setIdvoiture(int idvoiture) {
        this.idvoiture = idvoiture;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
        
    

    

}
