package com.example.Scafolding.repositories;


import com.example.Scafolding.entities.DummyEntity;
import com.example.Scafolding.models.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
