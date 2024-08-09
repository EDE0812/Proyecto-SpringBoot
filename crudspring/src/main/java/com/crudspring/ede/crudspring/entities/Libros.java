package com.crudspring.ede.crudspring.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor

public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50)
    private String titulo;

    @Column(length = 50)
    private String autor;

    @Column(length = 100)
    private String editorial;

    @Column(length = 4)
    private String anio;
}
