package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team,Long> {
	
	public Iterable<Team> findAll();

}
