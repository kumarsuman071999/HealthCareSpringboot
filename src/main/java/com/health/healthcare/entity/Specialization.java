package com.health.healthcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Specialization {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy ="specialization" )
    private List<Doctor> doctors;
    @ManyToOne()
    @JoinColumn(name="sympton_id")
    private Sympton sympton;
}
