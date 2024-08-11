package com.crudspring.ede.crudspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudspring.ede.crudspring.entities.Local;
import com.crudspring.ede.crudspring.repositories.LocalRepository;

@Service
public class LocalServiceImpl implements LocalService{
    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals(){
        return localRepository.findAll();
    }
}
