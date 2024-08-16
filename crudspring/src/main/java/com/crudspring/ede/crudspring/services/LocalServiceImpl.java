package com.crudspring.ede.crudspring.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudspring.ede.crudspring.entities.Local;
import com.crudspring.ede.crudspring.repositories.LocalRepository;

@Service //Hay que definir esto para que sepa que esto se conecta con la base de datos
public class LocalServiceImpl implements LocalService{
    @Autowired
    LocalRepository localRepository; //Inyectamos el repositorio

    @Override
    public List<Local> findAllLocals(){ //Se crea el metodo para listar todos los locales
        return localRepository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        return localRepository.save(local);
    }

    @Override
    public Local updateLocal(Long id, Local local) {
        Local localDB = localRepository.findById(id).get();
        if(Objects.nonNull(local.getCode()) && !"".equalsIgnoreCase(local.getCode())){
            localDB.setCode(local.getCode());
        }

        if(Objects.nonNull(local.getFloor()) && !"".equalsIgnoreCase(local.getFloor())){
            localDB.setFloor(local.getFloor());
        }

        if(Objects.nonNull(local.getName()) && !"".equalsIgnoreCase(local.getName())){
            localDB.setName(local.getName());
        }


        return localRepository.save(localDB);
    }

    @Override
    public void deleteLocal(Long id) {
        localRepository.deleteById(id);
    }
}
