package com.example.veterinaria.service;

import com.example.veterinaria.repositories.IVeterinaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryService {

    @Autowired
    IVeterinaryRepository iVeterinaryRepository;

}
