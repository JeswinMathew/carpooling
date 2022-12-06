package com.Capstone.Carpooling;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ride_taker")
public class RideTaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String rideGiverEmail;
    @Column(length = 45)
    private String StartLocation;
    @Column(length = 45)
    private String Destination;
    @Column(length = 45)
    private BigDecimal KM;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getRideGiverEmail() {
        return rideGiverEmail;
    }

    public void setRideGiverEmail(String rideGiverEmail) {
        this.rideGiverEmail = rideGiverEmail;
    }

    public String getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation(String startLocation) {
        StartLocation = startLocation;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public BigDecimal getKM() {
        return KM;
    }

    public void setKM(BigDecimal KM) {
        this.KM = KM;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}