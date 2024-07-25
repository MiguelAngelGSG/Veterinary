package com.example.veterinaria.service;

import com.example.veterinaria.model.AppointmentDetails;
import com.example.veterinaria.repositories.IVeterinaryRepositoryAppointmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceAppointmentDetails {

    @Autowired
    IVeterinaryRepositoryAppointmentDetails iVeterinaryRepositoryAppointmentDetails;

    public AppointmentDetails createAppointmentDetails(AppointmentDetails newAppointmentDetails){
        iVeterinaryRepositoryAppointmentDetails.save(newAppointmentDetails);
        return newAppointmentDetails;
    }
}
