package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import com.example.voiture.model.ImageVoiture;

@Repository
public interface ImageVoitureRepository extends JpaRepository<ImageVoiture, Integer> {
   // @Query("SELECT imagevoiture.id AS imagevoiture_id, imagevoiture.urlimage AS imagevoiture_url, users.id AS user_id, modele.nom AS modele, typecarburant.nom AS carburant, voiture.kilometrage AS kilometrage, voiture.couleur AS couleur, voiture.prix AS prix FROM imagevoiture JOIN voiture ON imagevoiture.idvoiture = voiture.id JOIN users ON voiture.iduser = users.id JOIN modele ON voiture.idmodele = modele.id JOIN typecarburant ON voiture.idtypecarburant = typecarburant.id")
   // List<Object[]> listImageWithVoiture();
}
 


 
 
