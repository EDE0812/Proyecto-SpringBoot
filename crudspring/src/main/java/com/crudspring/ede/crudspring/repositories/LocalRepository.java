package com.crudspring.ede.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudspring.ede.crudspring.entities.Local;

public interface LocalRepository extends JpaRepository<Local, Long> { //Nos permite extender metodos de JPARepository
    // En su generico nos pide la entidad con la que estamos trabajando y el tipo de dato de la primary Key de la entidad
    
}
