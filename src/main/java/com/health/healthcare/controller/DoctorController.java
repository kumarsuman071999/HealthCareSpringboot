package com.health.healthcare.controller;

import com.health.healthcare.entity.Doctor;
import com.health.healthcare.service.DoctorService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private DoctorService doctorService;

    @PostMapping("/create")
    public ResponseEntity<String> createDoctor(@RequestBody Doctor doctor){
        doctorService.saveDoctor(doctor);
        return new  ResponseEntity<>("Doctor added successfully", HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id){
        Doctor doctor=doctorService.getDoctorById(id);
        return new ResponseEntity<>(doctor,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDoctor( @PathVariable Long id){
        doctorService.deleteDoctor(id);
        return new ResponseEntity<>("Doctor deleted by Id :",HttpStatus.NO_CONTENT);
    }


}
