package com.lb.wscars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lb.wscars.models.Carro;

@ResponseBody
public interface CarroRepository extends JpaRepository<Carro, Long>{
    
}
