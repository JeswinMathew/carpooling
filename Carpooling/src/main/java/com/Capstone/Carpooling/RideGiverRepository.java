package com.Capstone.Carpooling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RideGiverRepository extends JpaRepository<RideGiver, Long> {
    @Query("SELECT rg FROM RideGiver rg WHERE rg.email = ?1")
    public RideGiver findByEmail(String email);

    @Query("SELECT rg FROM RideGiver rg WHERE rg.seats>0")
    public RideGiver findAllWithSeats();

    @Query("SELECT rg FROM RideGiver rg WHERE rg.id = ?1")
    public RideGiver findByID(Long id);

}

