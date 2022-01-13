package com.dvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie.entities.Movie;
import com.dvsuperior.dsmovie.entities.Score;
import com.dvsuperior.dsmovie.entities.ScorePK;
import com.dvsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email) ;
	
	

}
