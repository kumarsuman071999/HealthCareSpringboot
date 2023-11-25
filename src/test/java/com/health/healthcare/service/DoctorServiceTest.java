package com.health.healthcare.service;

import com.health.healthcare.entity.Doctor;
import com.health.healthcare.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorServiceTest {

    @Autowired
    private DoctorRepository doctorRepository;

    @InjectMocks
    private DoctorService doctorService;

    @Test
    void saveDoctor(){
        Doctor doctorToSave= new Doctor();
        doctorService.saveDoctor(doctorToSave);

        // verify that the save method of the repository is called
//        verify(doctorRepository,times(1).save(doctorToSave));
        



    }
}
