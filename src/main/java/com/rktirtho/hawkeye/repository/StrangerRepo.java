package com.rktirtho.hawkeye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.Stranger;

@Component
public interface StrangerRepo extends JpaRepository<Stranger, Integer>{

}

