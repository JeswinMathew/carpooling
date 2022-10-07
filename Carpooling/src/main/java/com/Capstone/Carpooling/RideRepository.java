package com.Capstone.Carpooling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RideRepository extends JpaRepository<Ride, Long> {
	@Query("SELECT r FROM Ride r WHERE r.id = ?1")
	public Ride findById(String id);
	
}
