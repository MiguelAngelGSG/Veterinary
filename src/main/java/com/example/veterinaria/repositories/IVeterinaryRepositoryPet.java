package com.example.veterinaria.repositories;
import com.example.veterinaria.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryPet extends CrudRepository<Pet, UUID> {
}