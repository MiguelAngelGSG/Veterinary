package com.example.veterinary.controller;

import com.example.veterinary.service.VeterinaryServicePet;
import org.springframework.web.bind.annotation.RestController;
import com.example.veterinary.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerPet {

    @Autowired
    VeterinaryServicePet veterinaryServicePet;

    @PostMapping(path = "/pet")
    public Pet createPet(@RequestBody Pet newPet) {
        return veterinaryServicePet.createPet(newPet);
    }

    @DeleteMapping(path = "/pets/{id}")
    public String deletePets(@PathVariable("id") Long id) {
		return veterinaryService.deletePets(id);
    }

}

