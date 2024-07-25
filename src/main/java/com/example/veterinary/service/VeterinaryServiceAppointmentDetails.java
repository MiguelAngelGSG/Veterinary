package com.example.veterinary.service;

import com.example.veterinary.model.AppointmentDetails;
import com.example.veterinary.repositories.IVeterinaryRepositoryAppointmentDetails;
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
