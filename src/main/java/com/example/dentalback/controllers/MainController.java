package com.example.dentalback.controllers;

import com.example.dentalback.models.Doctor;
import com.example.dentalback.services.implementation.DoctorServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class MainController {

    private final DoctorServices doctorServices;

    @GetMapping("/")
    public void test() {

        System.out.println("say test");
    }

    @PostMapping("/savedoctor")
    public void saveDoctor () {
        Doctor doctor = new Doctor("Dissssssma", "Sokssssssol", "ssssssssss");
         System.out.println(doctor);
         doctorServices.save(doctor);
      List<Doctor> doctorsList = doctorServices.getAllDoctor();
       System.out.println(doctorsList);
    }

}
