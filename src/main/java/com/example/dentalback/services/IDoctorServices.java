package com.example.dentalback.services;

import com.example.dentalback.models.Doctor;

import java.util.List;

public interface IDoctorServices {
    void save(Doctor doctor);

    List<Doctor> getAllDoctor();
}
