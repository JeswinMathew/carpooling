package com.Capstone.Carpooling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RideGiverRepository extends JpaRepository<RideGiver, Long> {
	
}
