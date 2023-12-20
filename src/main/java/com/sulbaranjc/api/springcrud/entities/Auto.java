package com.sulbaranjc.api.springcrud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Auto {
    @Id
    private Long id;
    private String marca;
    private int anno;
    private int capacidad;
    private double precio;
}
