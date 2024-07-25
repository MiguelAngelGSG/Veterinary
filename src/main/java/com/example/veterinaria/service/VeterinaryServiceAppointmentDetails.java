package com.example.veterinaria.service;

<<<<<<< HEAD
=======
import com.example.veterinaria.model.AppointmentDetails;
>>>>>>> origin/dev
import com.example.veterinaria.repositories.IVeterinaryRepositoryAppointmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceAppointmentDetails {

    @Autowired
    IVeterinaryRepositoryAppointmentDetails iVeterinaryRepositoryAppointmentDetails;

<<<<<<< HEAD
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

=======
    public AppointmentDetails createAppointmentDetails(AppointmentDetails newAppointmentDetails){
        iVeterinaryRepositoryAppointmentDetails.save(newAppointmentDetails);
        return newAppointmentDetails;
    }
>>>>>>> origin/dev
}
