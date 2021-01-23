package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.rktirtho.hawkeye.model.StrangerMonitor;

@Component
public interface StrangerMoniRepo extends JpaRepository<StrangerMonitor, Integer>{
	
	@Query(value = "select * from stranger_monitor where id=?1", nativeQuery = true)
	public List<StrangerMonitor> findByStId(int id);
	
	@Query(value = "SELECT distinct st_id FROM stranger_monitor", nativeQuery  = true)
	public Iterable<Integer> getStrangerId();
	
	@Query(value = "SELECT count(distinct st_id) FROM stranger_monitor where area= '1st Floor' and  DATE(`time`) = CURDATE()"
			, nativeQuery = true)
	public Long countTodayStrangers();
}
