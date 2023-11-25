package com.health.healthcare.service;

import com.health.healthcare.entity.Doctor;
import com.health.healthcare.exception.DonctorNotFoundException;
import com.health.healthcare.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Transactional
    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }

    @Transactional
    public Doctor getDoctorById(Long doctorId){
        return doctorRepository.findById(doctorId).orElseThrow(()-> new DonctorNotFoundException("Doctor Not Found with Id" +doctorId));
    }

    @Transactional
    public void deleteDoctor(Long doctorId){
        if(!doctorRepository.existsById(doctorId)){
            throw new DonctorNotFoundException("Doctor not found with this Id: "+doctorId);
        }
        doctorRepository.deleteById(doctorId);
    }
}
