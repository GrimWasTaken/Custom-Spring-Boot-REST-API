package com.blazblue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blazblue.model.Char;

@Repository
public interface CharRepo extends JpaRepository<Char, String>{
	
}
