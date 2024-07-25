package com.example.veterinary.service;

import com.example.veterinary.model.Owner;
import com.example.veterinary.repositories.IVeterinaryRepositoryOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceOwner {

    @Autowired
    IVeterinaryRepositoryOwner iVeterinaryRepositoryOwner;

    public Owner createOwner(Owner newOwner){
        iVeterinaryRepositoryOwner.save(newOwner);
        return newOwner;
    }
}
