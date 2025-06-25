package com.example.Scafolding.controllers;

import com.example.Scafolding.Dtos.DummyDto;
import com.example.Scafolding.models.Dummy;
import com.example.Scafolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")//para no poner en cada endpoint
public class DummyController {

    @Autowired
    //inyeccion de nuestro service en controller poner @autowired
    private DummyService dummyService;

    // hace los verbos mapping
    @GetMapping("") // este recibe el parametro dummy
    public ResponseEntity<DummyDto> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }

    @GetMapping("/{id}")//este rec id poner el@PathVariable
    public ResponseEntity<DummyDto> getDummyList(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<DummyDto> createDummy(@RequestBody DummyDto dto) {
        Dummy dummy = dummyService.createDummy(null);//le debo pasar dummy por ahora null
        return null;
    }

    @PutMapping("")
    public ResponseEntity<DummyDto> updateDummy() {
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }


    @DeleteMapping("")
    public ResponseEntity<DummyDto> deleteDummy() {
        dummyService.deleteDummy(null);// no se  hace Dummy dummy por que es un void
        return null;
    }
}
