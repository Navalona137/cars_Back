package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Integer> {

}
