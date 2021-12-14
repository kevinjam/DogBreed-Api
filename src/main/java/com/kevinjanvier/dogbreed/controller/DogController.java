package com.kevinjanvier.dogbreed.controller;

import com.kevinjanvier.dogbreed.model.DogDTO;
import com.kevinjanvier.dogbreed.model.Dogs;
import com.kevinjanvier.dogbreed.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DogController {

    private final DogService dogService;

    @PostMapping
    public ResponseEntity<Dogs> create(@RequestBody DogDTO dogDTO){
        return ResponseEntity.ok(dogService.save(dogDTO));
    }

    @GetMapping
    public ResponseEntity<List<Dogs>> getAllDogs(){
        return ResponseEntity.ok(dogService.findAll());
    }


    @PutMapping
    public ResponseEntity<Dogs> updateDogs(){

    }


    @DeleteMapping
    public ResponseEntity<Dogs> deleteDog(){

    }
}
