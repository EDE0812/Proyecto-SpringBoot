package com.crudspring.ede.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudspring.ede.crudspring.entities.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {
    
}
