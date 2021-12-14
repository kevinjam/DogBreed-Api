package com.kevinjanvier.dogbreed.repository;

import com.kevinjanvier.dogbreed.model.Breeds;
import org.springframework.data.repository.CrudRepository;

public interface BreedsRepository extends CrudRepository<Breeds,String> {
}
