package com.example.veterinaria.repositories;

import com.example.veterinaria.model.AppointmentDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryAppointmentDetails extends CrudRepository <AppointmentDetails, UUID> {
}
