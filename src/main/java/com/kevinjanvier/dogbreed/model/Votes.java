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
public class Votes {

    @Id
    @GeneratedValue
    private String id;
    private String dogID;
    private Integer vote;
}
