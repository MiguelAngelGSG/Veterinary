package com.example.veterinary.service;

import com.example.veterinary.model.Appointment;
import com.example.veterinary.repositories.IVeterinaryRepositoryAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceAppointment {

    @Autowired
    IVeterinaryRepositoryAppointment iVeterinaryRepositoryAppointment;

    public Appointment createAppointment(Appointment newAppointment){
        iVeterinaryRepositoryAppointment.save(newAppointment);
        return newAppointment;
    }
}
