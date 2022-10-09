package com.Capstone.Carpooling;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RideGiverRepository extends JpaRepository<RideGiver, Long> {
   /* @Query("SELECT r FROM RideGiver r WHERE r.destination = ?1")
    public RideGiver findByDestination(String destination);*/
}

