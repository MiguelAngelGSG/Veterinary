package com.example.veterinary.controller;

import com.example.veterinary.model.Appointment;
import com.example.veterinary.service.VeterinaryServiceAppointment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerAppointment {

    @Autowired
    VeterinaryServiceAppointment veterinaryServiceAppointment;

    @PostMapping(path = "/appointment")
    public Appointment createAppointmentDetails(@RequestBody Appointment newAppointment) {
        return veterinaryServiceAppointment.createAppointmentDetails(newAppointment);
    }
}