package com.Capstone.Carpooling;

import javax.persistence.*;

@Entity
@Table(name = "ride")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String userid;

    @Column(length = 45)
    private String startlocation;

    @Column(length = 45)
    private String destination;

    @Column(length = 45)
    private String passengercapacity;

    @Column(length = 45)
    private String CarNumber;

    @Column(length = 45)
    private String Charge;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCharge() {
        return Charge;
    }

    public void setCharge(String charge) {
        Charge = charge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
