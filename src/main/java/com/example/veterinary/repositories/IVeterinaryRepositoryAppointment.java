package com.example.veterinary.repositories;

import com.example.veterinary.model.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryAppointment extends CrudRepository <Appointment, UUID> {
}
