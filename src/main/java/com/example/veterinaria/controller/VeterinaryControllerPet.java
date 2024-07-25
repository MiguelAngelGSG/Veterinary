package com.example.veterinaria.controller;

import com.example.veterinaria.service.VeterinaryServicePet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.veterinaria.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerPet {

    @Autowired
    VeterinaryServicePet veterinaryServicePet;

    @PostMapping(path = "/pets")
    public Pet createPet(@RequestBody Pet newPet) {
        return veterinaryServicePet.createPet(newPet);
    }
<<<<<<< HEAD:src/main/java/com/example/veterinaria/controller/VeterinaryController.java

    @DeleteMapping(path = "/pets/{id}")
    public String deletePets(@PathVariable("id") Long id) {
		return veterinaryService.deletePets(id);
    }

}
=======
}
>>>>>>> origin/dev:src/main/java/com/example/veterinaria/controller/VeterinaryControllerPet.java
