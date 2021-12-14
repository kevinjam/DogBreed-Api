package com.kevinjanvier.dogbreed.model;

import lombok.*;

@Builder
@Data
@Getter
public class DogDTO {
    private String breedId;
    private String photoUrl;
    private String dogName;
    private String dogDescription;
}
