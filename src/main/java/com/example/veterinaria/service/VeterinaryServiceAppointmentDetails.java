package com.example.veterinaria.service;

import com.example.veterinaria.repositories.IVeterinaryRepositoryAppointmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryService {

    @Autowired
    IVeterinaryRepositoryAppointmentDetails iVeterinaryRepositoryAppointmentDetails;

    public class VeterinaryServiceAppointmentDetails {

        public String deleteAppoiment(Long id) {
            try {
                IVeterinaryRepository.deleteById(id);
                return "Appoiment deleted";
            } catch (Exception error) {
                return "Error";

            }
        }

    }

}
