package com.rktirtho.hawkeye.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Monitoring;
import com.rktirtho.hawkeye.model.Permitted;
import com.rktirtho.hawkeye.repository.MonitoringRepo;
import com.rktirtho.hawkeye.repository.PermittRepo;

@RestController
@RequestMapping("api/monitoring")
public class MonitoringApi {

	@Autowired
	private MonitoringRepo repo;

	@Autowired
	PermittRepo permittRepo;

//	@GetMapping("all")
//	public List<Monitoring> getAll(){
//		return repo.findAll();
//	}
//	

	@GetMapping("all")
	public List<Monitoring> findAll(@PathVariable("id") int id) {
		return repo.findAll();
	}

	@GetMapping("person/{id}")
	public List<Monitoring> findByPersonId(@PathVariable("id") int id) {
		return repo.findByPersonId(id);
	}

	@GetMapping("person/access/auth/{id}")
	public List<Monitoring> findPersonAuthorizedAccess(@PathVariable("id") int id) {
		return repo.findByPersonIdAndIsPermitted(id, true);
	}

	@GetMapping("person/access/unauth/{id}")
	public List<Monitoring> findPersonUnauthorizedAccess(@PathVariable("id") int id) {
		return repo.findByPersonIdAndIsPermitted(id, false);
	}

	@GetMapping("today")
	public List<Permitted> findToday() {
		Iterable<Integer> ids = repo.getToDayAccessPersonId();
		return permittRepo.findAllById(ids);
	}
	@GetMapping("yesterday")
	public List<Permitted> findYesterday() {
		Iterable<Integer> ids = repo.getYesterdayAccessPersonId();
		return permittRepo.findAllById(ids);
	}
	
	@GetMapping("access/authorized")
	public List<Permitted> findAuthorizedAccess() {
		Iterable<Integer> ids = repo.getAuthorizedAccessPerson();
		return permittRepo.findAllById(ids);
	}
	
	@GetMapping("access/unauthorized")
	public List<Permitted> findUnauthorizedAccess() {
		Iterable<Integer> ids = repo.getUnauthorizedAccessPerson();
		return permittRepo.findAllById(ids);
	}

}
