package com.cjgmj.testSpringRest.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjgmj.testSpringRest.entity.Player;

@Repository("playerRepository")
public interface PlayerRepository extends CrudRepository<Player, Serializable>{

	List<Player> findTop5ByNationality(String nationality);
	
	@Query(value = "SELECT * FROM player p INNER JOIN team t ON p.team=t.id INNER JOIN league l ON t.league=l.id "
			+ "WHERE l.name=:league ORDER BY p.rate DESC, p.surname DESC LIMIT 1", 
			nativeQuery = true)
	Player findFirstByLeague(@Param("league") String league);
	
}
