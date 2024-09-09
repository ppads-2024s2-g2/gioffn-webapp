package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departament_name")
    private String name;

    @Column(name = "quantity_employees")
    private String quantityEmployees;

    @Column(name = "departament_email")
    private String email;


}
