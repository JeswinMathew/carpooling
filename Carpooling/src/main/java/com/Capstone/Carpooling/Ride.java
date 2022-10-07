package com.Capstone.Carpooling;

import javax.persistence.*;

@Entity
@Table(name = "ride")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String riderid;

    @Column(nullable = false, unique = true, length = 45)
    private String startlocation;

    @Column(nullable = false, unique = true, length = 45)
    private String destination;

    @Column(nullable = false, unique = true, length = 45)
    private String passengercapacity;

    @Column(nullable = false, unique = true, length = 45)
    private String CarNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiderid() {
        return riderid;
    }

    public void setRiderid(String riderid) {
        this.riderid = riderid;
    }

    public String getStartlocation() {
        return startlocation;
    }

    public void setStartlocation(String startlocation) {
        this.startlocation = startlocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPassengercapacity() {
        return passengercapacity;
    }

    public void setPassengercapacity(String passengercapacity) {
        this.passengercapacity = passengercapacity;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }
}
