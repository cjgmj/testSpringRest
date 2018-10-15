package com.cjgmj.testSpringRest.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjgmj.testSpringRest.entity.Player;

@Repository("playerRepository")
public interface PlayerRepository extends CrudRepository<Player, Serializable>{

	List<Player> findTop5ByNationality(String nationality);
	
	@Query("SELECT p FROM Player p WHERE p.team.league.name=:league ORDER BY p.rate DESC, p.surname DESC")
	Stream<Player> firstByLeague(@Param("league") String league);
	
	default Player findFirstByLeague(String league){
		Optional<Player> player = firstByLeague(league).findFirst();
		
		if(player.isPresent())
			return player.get();
		
		return null;
	};
	
}
