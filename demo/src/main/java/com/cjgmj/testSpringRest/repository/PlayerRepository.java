package com.cjgmj.testSpringRest.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjgmj.testSpringRest.entity.Player;

@Repository("playerRepository")
public interface PlayerRepository extends CrudRepository<Player, Serializable>{

	List<Player> findTop5ByNationality(String nationality);
	
}
