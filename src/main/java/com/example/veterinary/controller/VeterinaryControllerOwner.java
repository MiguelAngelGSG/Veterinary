package com.example.veterinary.controller;

import com.example.veterinary.model.Owner;
import com.example.veterinary.service.VeterinaryServiceOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerOwner {

    @Autowired
    VeterinaryServiceOwner veterinaryServiceOwner;

    @PostMapping(path = "/owner")
    public Owner createOwner(@RequestBody Owner newOwner) {
        return veterinaryServiceOwner.createOwner(newOwner);
    }
}