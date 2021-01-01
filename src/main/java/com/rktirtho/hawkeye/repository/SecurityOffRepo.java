package com.rktirtho.hawkeye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.SecurityOfficer;
@Component
public interface SecurityOffRepo extends JpaRepository<SecurityOfficer, Integer>{
	

}
