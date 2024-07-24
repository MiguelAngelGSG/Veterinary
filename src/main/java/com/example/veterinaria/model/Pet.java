package com.example.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pet_id")
    private UUID uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "breed")
    private String breed;

    @Column(name = "gender")
    private String gender;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owners owner;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private Set<AppointmentDetails> appointmentDetails = new HashSet<>();
}


