package com.example.veterinary.controller;

import com.example.veterinary.model.AppointmentDetails;
import com.example.veterinary.service.VeterinaryServiceAppointmentDetails;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerAppointmentDetails {

    @Autowired
    VeterinaryServiceAppointmentDetails veterinaryServiceAppointmentDetails;

    @PostMapping(path = "/appointments")
    public AppointmentDetails createAppointmentDetails(@RequestBody AppointmentDetails newAppointmentDetails) {
        return veterinaryServiceAppointmentDetails.createAppointmentDetails(newAppointmentDetails);
    }
}