package com.Capstone.Carpooling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TravellerRepository extends JpaRepository<Traveller, Long> {
	@Query("SELECT t FROM Traveller t WHERE t.id = ?1")
	public Traveller findById(String id);
	
}
