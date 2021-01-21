package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.Monitoring;
import com.rktirtho.hawkeye.model.Stranger;

public interface MonitoringRepo extends JpaRepository<Monitoring, Integer>{
	public List<Monitoring> findByPersonId(int id);
	public List<Monitoring> findByPersonIdAndIsPermitted(int id, boolean isPermitted);
	
	@Query(value = "SELECT distinct person_id FROM monitoring where DATE(`time`) = CURDATE()", nativeQuery = true)
	public Iterable<Integer> getToDayAccessPersonId();
	
	@Query(value = "SELECT * FROM monitoring where person_id=?1 and DATE(`time`) = CURDATE()", nativeQuery = true)
	public List<Monitoring> getToDayAccessByPersonId(int id);
	
	@Query(value = "SELECT distinct person_id FROM monitoring where DATE(`time`) = CURDATE()-1", nativeQuery = true)
	public Iterable<Integer> getYesterdayAccessPersonId();
	
	@Query(value = "SELECT * FROM monitoring where person_id=?1 and DATE(`time`) = CURDATE()-1", nativeQuery = true)
	public List<Monitoring> getYesterdayAccessByPersonId(int id);
	
	@Query(value = "SELECT distinct person_id FROM monitoring where is_permitted=1", nativeQuery = true)
	public Iterable<Integer> getAuthorizedAccessPerson();
	
	@Query(value = "SELECT distinct person_id FROM monitoring where is_permitted=0", nativeQuery = true)
	public Iterable<Integer> getUnauthorizedAccessPerson();
	
	@Query(value = "SELECT * FROM monitoring where person_id=?1", nativeQuery = true)
	public List<Monitoring> getAccessByPersonId(int id);
	
	
//	================================= Stranger Monitoring ====================================//
	
	@Query(value = "select * from monitoring where person_id=?1 and is_permitted=-1",nativeQuery = true)
	public Stranger getStrangerById(int id);
	
	
	
	

}
