package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {

}
