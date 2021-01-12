package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.Monitoring;

public interface MonitoringRepo extends JpaRepository<Monitoring, Integer>{
	public List<Monitoring> findByPersonId(int id);
	public List<Monitoring> findByPersonIdAndIsPermitted(int id, boolean isPermitted);
	
	@Query(value = "SELECT distinct person_id FROM monitoring where DATE(`time`) = CURDATE()", nativeQuery = true)
	public Iterable<Integer> getToDayAccessPersonId();

}
