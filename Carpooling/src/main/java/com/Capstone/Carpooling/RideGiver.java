package com.Capstone.Carpooling;

import javax.persistence.*;

@Entity
@Table(name = "ride_giver")
public class RideGiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45)
    private long ride_giver_id;

    public long getRide_giver_id() {
        return ride_giver_id;
    }

    public void setRide_giver_id(long ride_giver_id) {
        this.ride_giver_id = ride_giver_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}