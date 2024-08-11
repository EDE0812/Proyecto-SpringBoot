package com.crudspring.ede.crudspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudspring.ede.crudspring.entities.Local;
import com.crudspring.ede.crudspring.services.LocalService;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;
    @GetMapping("/findAllLocals")
    public List<Local> findAllLocals(){
        return localService.findAllLocals();
    }

}
