package com.example.Scafolding.services.impl;

import com.example.Scafolding.models.Dummy;
import com.example.Scafolding.repositories.DummyRepository;
import com.example.Scafolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

//poner @service
@Service
public class DummyServiceImpl implements DummyService {

    @Autowired
    private DummyRepository dummyRepository;

    @Override
    public Dummy getDummy(Long id) {
        return null;
    }

    @Override
    public List<Dummy> getDummyList() {
        return List.of();
    }

    @Override
    public Dummy createDummy(Dummy dummy) {
        return null;
    }

    @Override
    public Dummy updateDummy(Dummy dummy) {
        return null;
    }

    @Override
    public void deleteDummy(Long id) {

    }
}
