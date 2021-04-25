package com.example.dentalback.dao;

import com.example.dentalback.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDAO  extends JpaRepository<Doctor, Integer> {
}
