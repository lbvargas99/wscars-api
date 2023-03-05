package com.lb.wscars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.wscars.models.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
