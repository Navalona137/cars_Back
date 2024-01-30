package com.example.voiture.Front.Postgres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voiture.Front.Postgres.modele.Favoris;

public interface FavorisRepository extends JpaRepository<Favoris, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    List<Favoris> findByIduser(int id);
    List<Favoris> findByIdvoiture(int id);
}
