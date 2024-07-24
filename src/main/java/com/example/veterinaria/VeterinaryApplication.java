package com.example.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeterinaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryApplication.class, args);
	}

	public String deletePets(Long id){
        try{
			IVeterinaryRepository.deleteById(id);
            return "todo bien";
        }catch (Exception error){
        return "todo mal";

}
