package com.example.veterinary.controller;

import com.example.veterinary.model.Owner;
import com.example.veterinary.service.VeterinaryServiceOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class VeterinaryControllerOwners {

    @Autowired
    VeterinaryServiceOwner veterinaryServiceOwner;

    @PostMapping(path = "/owner")
    public Owner createOwner(@RequestBody Owner newOwner) {
        return veterinaryServiceOwner.createOwner(newOwner);
    }

@DeleteMapping(path = "/Owner/{id}")
    public String deleteOwner(@PathVariable("id") Long id) {
		return veterinaryService.deleteOwner(id);

    }
}



}
