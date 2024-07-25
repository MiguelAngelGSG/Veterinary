package com.example.veterinaria.controller;

import com.example.veterinaria.model.Owner;
import com.example.veterinaria.model.Pet;
import com.example.veterinaria.service.VeterinaryServiceOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerOwners {

    @Autowired
    VeterinaryServiceOwner veterinaryServiceOwner;

    @PostMapping(path = "/owners")
    public Owner createOwner(@RequestBody Owner newOwner) {
        return veterinaryServiceOwner.createOwner(newOwner);
    }
}