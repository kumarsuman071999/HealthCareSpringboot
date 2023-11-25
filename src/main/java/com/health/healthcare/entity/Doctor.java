package com.health.healthcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long regNo;

    private String name;

    @ManyToOne
    @JoinColumn(name="specialization_id")
    private Specialization specialization;
    private double experience;
    private String hospital;
}
