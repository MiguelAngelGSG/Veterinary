package com.example.veterinary.repositories;
import com.example.veterinary.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryPet extends CrudRepository<Pet, UUID> {
}