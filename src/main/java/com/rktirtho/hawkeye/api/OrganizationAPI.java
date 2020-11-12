package com.rktirtho.hawkeye.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Organizations;
import com.rktirtho.hawkeye.repository.OrganizationsRepo;

@RestController
public class OrganizationAPI {
	
	@Autowired
	OrganizationsRepo orgRepo;
	
	@GetMapping("api/organizations")
	public List<Organizations> getAll() {
		return orgRepo.findAll();
		
	}
	
	@GetMapping("api/organization/{id}")
	public Organizations getById(@PathVariable("id") int id) {
		return orgRepo.findById(id).orElse(new Organizations());
		
	}
	// To Do
//	@PostMapping("api/addorganization")
//	public Organizations addOrganization(@ModelAttribute Organizations org) {
//		return orgRepo.save(org);
//		
//	}
	
	@GetMapping("api/organizations/{name}")
	public List<Organizations> getByName(@PathVariable("name") String name) {
		return orgRepo.findByName(name);
		
	}

}
