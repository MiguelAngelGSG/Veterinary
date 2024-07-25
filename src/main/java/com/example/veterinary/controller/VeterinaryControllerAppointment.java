package com.example.veterinary.controller;

import com.example.veterinary.model.Appointment;
import com.example.veterinary.service.VeterinaryServiceAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")

public class VeterinaryControllerAppointment {

    @Autowired
    VeterinaryServiceAppointment veterinaryServiceAppointment;

    @PostMapping(path = "/api/appointment")
    public Appointment createAppointment(@RequestBody Appointment newAppointment) {
        return veterinaryServiceAppointment.createAppointment(newAppointment);
    }
}
