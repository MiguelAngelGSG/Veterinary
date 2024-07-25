package com.example.veterinaria.controller;

import com.example.veterinaria.model.Pet;
import com.example.veterinaria.service.VeterinaryServiceOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerOwners {

    @Autowired
    VeterinaryServiceOwner veterinaryServiceOwner;
}


