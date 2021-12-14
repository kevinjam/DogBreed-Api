package com.kevinjanvier.dogbreed.repository;

import com.kevinjanvier.dogbreed.model.Votes;
import org.springframework.data.repository.CrudRepository;

public interface VotesRepository extends CrudRepository<Votes, String> {
}
