package com.example.veterinaria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Owners getOwner() {
        return owner;
    }

    public void setOwner(Owners owner) {
        this.owner = owner;
    }

    public Set<AppointmentDetails> getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(Set<AppointmentDetails> appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }
}

