package com.appmovies.appmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appmovies.appmovies.entities.Score;
import com.appmovies.appmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}
