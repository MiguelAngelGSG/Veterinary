package com.example.veterinary.repositories;

import com.example.veterinary.model.AppointmentDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryAppointmentDetails extends CrudRepository <AppointmentDetails, UUID> {
}
