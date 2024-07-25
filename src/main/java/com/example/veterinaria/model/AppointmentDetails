package com.example.veterinaria.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "appointment_details")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "appointment_id")
    private UUID uuid;

    @Column(name = "date_time")
    private String dateTime;

    @Column(name = "name")
    private String name;

    @Column(name = "consultation_type")
    private String consultationType;

    @Column(name = "reason")
    private String reason;

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;
}
