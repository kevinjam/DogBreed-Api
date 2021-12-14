package com.kevinjanvier.dogbreed.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dogs {
    @Id
    @GeneratedValue
    private Long id;
    private String breedId;
    private String photoUrl;
    private String dogName;
    private String dogDescription;

    public static void create(DogDTO dogDTO) {
        this.breedId = dogDTO.getBreedId();
    }
}
