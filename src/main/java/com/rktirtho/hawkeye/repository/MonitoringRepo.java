package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.Monitoring;

public interface MonitoringRepo extends JpaRepository<Monitoring, Integer>{
	public List<Monitoring> findByPersonId(int id);

}
