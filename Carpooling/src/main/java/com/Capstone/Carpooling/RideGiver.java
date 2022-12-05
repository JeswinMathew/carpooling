package com.Capstone.Carpooling;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ride_giver")
public class RideGiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 45)
    private long ride_giver_id;
    @Column(length = 45)
    private String StartLocation;
    @Column(length = 45)
    private String Destination;
    @Column(length = 45)
    private BigDecimal pricePerKM;
    @Column(length = 45)
    private String CarNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 2)
    private String seats;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public java.sql.Date getRideDate() {
        return rideDate;
    }

    public void setRideDate(java.sql.Date rideDate) {
        this.rideDate = rideDate;
    }

    public void setRideDate(Date rideDate) {
        this.rideDate = (java.sql.Date) rideDate;
    }

    @Column(length = 45)
    private java.sql.Date rideDate;

    public String getseats() {
        return seats;
    }

    public void setseats(String seats) {
        this.seats = seats;
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

    public BigDecimal getPricePerKM() {
        return pricePerKM;
    }

    public void setPricePerKM(BigDecimal pricePerKM) {
        this.pricePerKM = pricePerKM;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }


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