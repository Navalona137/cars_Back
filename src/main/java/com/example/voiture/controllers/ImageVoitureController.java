package com.example.voiture.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Users;
import com.example.voiture.model.Modele;
import com.example.voiture.model.TypeCarburant;
import com.example.voiture.model.Voiture;
import com.example.voiture.model.ImageVoiture;
import com.example.voiture.repository.ImageVoitureRepository;

@RestController
public class ImageVoitureController {

    @Autowired
    private ImageVoitureRepository mp;

    @GetMapping("/listImageVoiture")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ImageVoiture> listImageVoiture() {
        return mp.findAll();
    }
    /*public List<ImageVoiture> listImageWithVoiture() {
        List<Object[]> resultList = mp.listImageWithVoiture();

        List<ImageVoiture> imgVoitureList = new ArrayList<>();
        for (Object[] result : resultList) {
            ImageVoiture img = new ImageVoiture();
            img.setId((Integer) result[0]);
            img.setUrlImage((String) result[1]);

            Voiture voiture = new Voiture();
            Users user = new Users();
            Modele mod = new Modele();
            TypeCarburant carb = new TypeCarburant();

            user.setId((Integer) result[2]);
            mod.setNom((String) result[3]);
            carb.setNom((String) result[4]);

            voiture.setUser(user);
            voiture.setModele(mod);
            voiture.setTypeCarburant(carb);
            voiture.setKilometrage((Integer) result[5]);
            voiture.setCouleur((String) result[6]);
            voiture.setPrix((Double) result[7]);

            img.setVoiture(voiture);

            imgVoitureList.add(img);
        }

        return imgVoitureList;
    }*/
}
