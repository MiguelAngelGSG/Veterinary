package com.example.veterinaria.repositories;

import com.example.veterinaria.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryOwner extends CrudRepository <Owner, UUID >{
}

