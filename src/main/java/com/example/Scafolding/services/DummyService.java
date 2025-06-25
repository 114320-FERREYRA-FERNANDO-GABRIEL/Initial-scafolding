package com.example.Scafolding.services;

import com.example.Scafolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {

    Dummy getDummy(Long id);//traer dummy por id

    List<Dummy> getDummyList();//lista de dummy para desp poder update ,delete

    Dummy createDummy(Dummy dummy);//crear un dummy

    Dummy updateDummy(Dummy dummy);//actualizar un dummy

    void deleteDummy(Long id);//borrar un dummy

}
