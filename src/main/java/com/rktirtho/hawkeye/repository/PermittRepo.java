package com.rktirtho.hawkeye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rktirtho.hawkeye.model.Permitted;

public interface PermittRepo extends JpaRepository<Permitted, Integer>{

}
