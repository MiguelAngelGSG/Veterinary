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
<<<<<<< HEAD:src/main/java/com/example/veterinaria/service/VeterinaryService.java

    public String deletePets(Long id) {
        try {
            IVeterinaryRepository.deleteById(id);
            return "Pet deleted";
        } catch (Exception error) {
            return "Error";

        }

    }

=======
>>>>>>> origin/dev:src/main/java/com/example/veterinaria/service/VeterinaryServicePet.java
}
