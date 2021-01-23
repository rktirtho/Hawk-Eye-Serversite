package com.rktirtho.hawkeye.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Stranger;
import com.rktirtho.hawkeye.model.StrangerMonitor;
import com.rktirtho.hawkeye.repository.StrangerMoniRepo;
import com.rktirtho.hawkeye.repository.StrangerRepo;

@RestController
@RequestMapping("api/")
public class StrangerMonitoringApi {
	
	@Autowired
	private StrangerMoniRepo moniRepo;
	@Autowired
	private StrangerRepo strangerRepo;
	
	@GetMapping("monitoring/strangers")
	public List<Stranger> getAll(){
		Iterable<Integer> ids = moniRepo.getStrangerId();
		
		return strangerRepo.findAllById(ids);
	}
	
	@GetMapping("monitoring/stranger/{id}")
	public List<StrangerMonitor> getAccessByStId(@PathVariable("id") int id){
		return moniRepo.findAll();
	}
	
	@GetMapping("monitoring/stranger/today")
	public Long getAccessByStId(){
		return moniRepo.countTodayStrangers();
	}
	
	

}
