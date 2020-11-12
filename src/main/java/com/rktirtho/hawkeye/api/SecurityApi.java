package com.rktirtho.hawkeye.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.SecurityOfficer;
import com.rktirtho.hawkeye.repository.SecurityOffRepo;

@RestController
public class SecurityApi {
	
	@Autowired
	SecurityOffRepo securityOffRepo;
	
	
	@PostMapping
	public SecurityOfficer save (SecurityOfficer officer) {
		return securityOffRepo.save(officer);
	}
	
	@GetMapping("api/securityofficers")
	public List<SecurityOfficer> findAll(){
		return securityOffRepo.findAll();
	}
	
	@GetMapping("api/securityofficer/{id}")
	public SecurityOfficer findOne(@PathVariable("id") int id) {
		return securityOffRepo.findById(id).orElse(new SecurityOfficer());
	}

}
