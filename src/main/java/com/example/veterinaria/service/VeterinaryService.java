package com.example.veterinaria.service;


import com.example.veterinaria.model.Pet;
import com.example.veterinaria.repositories.IVeterinaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VeterinaryService {

    @Autowired
    IVeterinaryRepository iVeterinaryRepository;

    public ArrayList<Pet> getAllInfo() {
        return new ArrayList<>();
    }

    public String deletePets(Long id){
        try{
			IVeterinaryRepository.deleteById(id);
            return "todo bien";
        }catch (Exception error){
        return "todo mal";

}

}

}

