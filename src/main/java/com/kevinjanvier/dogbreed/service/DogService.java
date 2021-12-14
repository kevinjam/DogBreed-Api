package com.kevinjanvier.dogbreed.service;

import com.kevinjanvier.dogbreed.model.DogDTO;
import com.kevinjanvier.dogbreed.model.Dogs;
import com.kevinjanvier.dogbreed.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {
    private final DogRepository dogRepository;
    public Dogs save(DogDTO dogDTO){
        //TODO ADD DOGS here
        return dogRepository.save();
    }

    public List<Dogs> findAll() {
        return (List<Dogs>) dogRepository.findAll();
    }
}
