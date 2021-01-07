package com.rktirtho.hawkeye.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Monitoring;
import com.rktirtho.hawkeye.repository.MonitoringRepo;

@RestController
@RequestMapping("api/monitoring")
public class MonitoringApi {
	
	@Autowired
	private MonitoringRepo repo;
	
//	@GetMapping("all")
//	public List<Monitoring> getAll(){
//		return repo.findAll();
//	}
//	
	@GetMapping("person/{id}")
	public List<Monitoring> findByPersonId(@PathVariable("id")int id) {
		return repo.findByPersonId(id);
	} 
	
	@GetMapping("person/access/auth/{id}")
	public List<Monitoring> findPersonAuthorizedAccess(@PathVariable("id")int id) {
		return repo.findByPersonIdAndIsPermitted(id, true);
	}
	
	@GetMapping("person/access/unauth/{id}")
	public List<Monitoring> findPersonUnauthorizedAccess(@PathVariable("id")int id) {
		return repo.findByPersonIdAndIsPermitted(id, false);
	} 

}
