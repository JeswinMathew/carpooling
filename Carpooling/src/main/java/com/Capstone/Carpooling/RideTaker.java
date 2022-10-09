package com.Capstone.Carpooling;

import javax.persistence.*;

@Entity
@Table(name = "ride_taker")
public class RideTaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45)
    private long ride_id;

    public long getRide_id() {
        return ride_id;
    }

    public void setRide_id(long ride_id) {
        this.ride_id = ride_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}