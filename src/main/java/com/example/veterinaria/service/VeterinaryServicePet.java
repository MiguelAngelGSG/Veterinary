package com.example.veterinaria.service;

import com.example.veterinaria.model.Pet;
import com.example.veterinaria.repositories.IVeterinaryRepositoryPet;
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

    public String deletePets(Long id) {
        try {
            IVeterinaryRepository.deleteById(id);
            return "Pet deleted";
        } catch (Exception error) {
            return "Error";

        }

    }

}
