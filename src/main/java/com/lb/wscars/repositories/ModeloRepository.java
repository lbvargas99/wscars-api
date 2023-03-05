package com.lb.wscars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.wscars.models.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long>{
    
}
