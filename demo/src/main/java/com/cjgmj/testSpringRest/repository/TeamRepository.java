package com.cjgmj.testSpringRest.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjgmj.testSpringRest.entity.Team;

@Repository("teamRepository")
public interface TeamRepository extends CrudRepository<Team, Serializable>{

}
