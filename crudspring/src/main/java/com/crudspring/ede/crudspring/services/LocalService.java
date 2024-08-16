package com.crudspring.ede.crudspring.services;

import java.util.List;

import com.crudspring.ede.crudspring.entities.Local;

public interface LocalService {
    List<Local> findAllLocals(); //Aqui yo estoy definiendo el nombre de mi funcion que traera todos los nombres de los locales
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
}
