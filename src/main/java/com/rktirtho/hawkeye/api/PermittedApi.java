package com.rktirtho.hawkeye.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Permitted;
import com.rktirtho.hawkeye.repository.PermittRepo;

import java.util.List;

@RestController
@RequestMapping("api")
public class PermittedApi {
	
	@Autowired
	PermittRepo repo;
	
	@GetMapping("permitteds")
	public List<Permitted> getAll(){
		return repo.findAll();
		
	}
	@GetMapping("permitted/{id}")
	public Permitted getOne(@PathVariable("id") int id){
		return repo.findById(id).orElse(null);
		
	}

}
