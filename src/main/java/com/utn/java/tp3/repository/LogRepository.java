package com.utn.java.tp3.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.utn.java.tp3.model.Logs;

@Repository
public interface LogRepository extends JpaRepository<Logs, Long> {

	@Query("Select webBrowser,operativeSystem from Logs")
	List<?> getAll();

	@Query("Select webBrowser,operativeSystem,count(id) as cant from Logs group by(webBrowser) order by cant desc")
	List<?> mostCombination();

}
