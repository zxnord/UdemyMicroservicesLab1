package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team,Long> {

	public Iterable<Team> findAll();

	public Team findOne(Long id);

}
