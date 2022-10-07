package com.Capstone.Carpooling;

import javax.persistence.*;

@Entity
@Table(name = "ride")
public class Traveller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String rideid;

    @Column(nullable = false, unique = true, length = 45)
    private String userid;

    @Column(nullable = false, unique = true, length = 45)
    private String pickuplocation;

    @Column(nullable = false, unique = true, length = 45)
    private String dropofflocation;

    @Column(nullable = false, unique = true, length = 45)
    private String payment;

}