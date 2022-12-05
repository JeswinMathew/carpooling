package com.Capstone.Carpooling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RideTakerRepository extends JpaRepository<RideTaker, Long> {
    @Query("SELECT rt FROM RideTaker rt WHERE rt.email = ?1")
    public RideTaker findByEmail(String email);
    @Query("SELECT rt FROM RideTaker rt WHERE rt.id = ?1")
    public RideTaker findByID(Long id);

    @Query("SELECT rt FROM RideTaker rt WHERE rt.ride_Id = ?1")
    public RideTaker findByRideId(Long ride_Id);
	
}
