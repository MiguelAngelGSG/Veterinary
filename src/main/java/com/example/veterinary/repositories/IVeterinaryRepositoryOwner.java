package com.example.veterinary.repositories;

import com.example.veterinary.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IVeterinaryRepositoryOwner extends CrudRepository <Owner, UUID >{
}

