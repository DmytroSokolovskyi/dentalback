package com.example.dentalback.services.implementation;

import com.example.dentalback.dao.DoctorDAO;
import com.example.dentalback.models.Doctor;
import com.example.dentalback.services.IDoctorServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServices implements IDoctorServices {
    private final DoctorDAO doctorDAO;

    @Override
    public void save(Doctor doctor) {
        doctorDAO.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorDAO.findAll();
    }


}
