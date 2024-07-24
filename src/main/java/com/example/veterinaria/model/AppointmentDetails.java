package com.example.veterinaria.model;


import jakarta.persistence.*;



@Entity
@Table(name = "appointment_details")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int appointmentId;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = true)
    private Pet pet;

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

    // Getters y Setters
}
