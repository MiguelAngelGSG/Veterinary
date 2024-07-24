package com.example.veterinaria.repositories;
import com.example.veterinaria.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface IVeterinaryRepository extends CrudRepository<Pet, Integer> {

    //static Object findALL() {
    //}
}