package com.example.veterinaria.service;

import com.example.veterinaria.model.Owner;
import com.example.veterinaria.repositories.IVeterinaryRepositoryOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceOwner {

    @Autowired
    IVeterinaryRepositoryOwner iVeterinaryRepositoryOwner;
}
