package com.kevinjanvier.dogbreed.config;

import com.kevinjanvier.dogbreed.model.DogDTO;
import com.kevinjanvier.dogbreed.model.Dogs;
import com.kevinjanvier.dogbreed.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class Data implements CommandLineRunner {
    private final DogRepository dogRepository;

    @Override
    public void run(String... args) throws Exception {
        DogDTO dogDTO = DogDTO.builder()
                .breedId("1")
                .dogName("German Sherperd")
                .dogDescription("brown in color")
                .photoUrl("http://i.imgur.com/eE29vX4.png")
                .build();
        log.info("---------response----- {} ", dogDTO);
        Dogs newDog = new Dogs();
        Dogs.create(dogDTO);
        dogRepository.save(newDog);
    }
}
