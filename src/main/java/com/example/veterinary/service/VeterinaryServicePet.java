package com.example.veterinary.service;

import com.example.veterinary.model.Pet;
import com.example.veterinary.repositories.IVeterinaryRepositoryPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServicePet {

    @Autowired
    IVeterinaryRepositoryPet iVeterinaryRepositoryPet;

    public Pet createPet(Pet newPet){
        iVeterinaryRepositoryPet.save(newPet);
        return newPet;
    }
}
