package com.rktirtho.hawkeye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.Monitoring;

@Component
public interface MonitoringRepo extends JpaRepository<Monitoring, Integer>{

}
