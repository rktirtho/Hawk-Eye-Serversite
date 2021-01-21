package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.rktirtho.hawkeye.model.StrangerMonitoring;

public interface StrangerMoniRepo extends JpaRepository<StrangerMonitoring, Integer>{
	
	
	List<StrangerMonitoring> findByStId(int id);
}
