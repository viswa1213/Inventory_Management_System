package com.example.InventoryManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PID;

    private String ProductName;
    String Price;
    String HD;
}
