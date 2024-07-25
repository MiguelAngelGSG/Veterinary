package com.example.veterinaria.controller;

import com.example.veterinaria.service.VeterinaryServiceAppointmentDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.veterinaria.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerAppointmentDetails {

    @Autowired
    VeterinaryServiceAppointmentDetails veterinaryServiceAppointmentDetails;
}





