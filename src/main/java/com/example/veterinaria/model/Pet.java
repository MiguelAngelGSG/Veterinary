package com.example.veterinaria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private int petId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "breed")
    private String breed;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owners owner;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private Set<AppointmentDetails> appointmentDetails = new HashSet<>();

    // Getters y Setters
}

