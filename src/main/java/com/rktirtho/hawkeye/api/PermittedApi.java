package com.rktirtho.hawkeye.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.dto.PermittedDetails;
import com.rktirtho.hawkeye.model.Permitted;
import com.rktirtho.hawkeye.repository.PermittRepo;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api")
public class PermittedApi {
	
	@Autowired
	PermittRepo repo;
	
	
	@GetMapping("permitteds")
	public List<Permitted> getAll(){
		return repo.getAllPermitteds();
	}
	
	@GetMapping("permitteds/org/{id}")
	public List<Permitted> getAllByOrgId(@PathVariable("id") int id){
		return repo.findByOrgId(id);
	}
	
	@GetMapping("get")
	public List<Permitted> get(){
		return repo.getAllTest();
		
	}
		
	@GetMapping("permitted/{id}")
	public Permitted getOne(@PathVariable("id") int id){
		return repo.findById(id).orElse(null);
		
	}

}
