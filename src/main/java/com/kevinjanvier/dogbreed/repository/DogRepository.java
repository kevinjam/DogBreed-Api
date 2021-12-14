package com.kevinjanvier.dogbreed.repository;

import com.kevinjanvier.dogbreed.model.Dogs;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dogs, Long> {
}
