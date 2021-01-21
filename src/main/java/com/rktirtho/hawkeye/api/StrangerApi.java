package com.rktirtho.hawkeye.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.Stranger;
import com.rktirtho.hawkeye.repository.StrangerRepo;

@RestController
@RequestMapping("api/stranger")
public class StrangerApi {
	
	@Autowired
	StrangerRepo repo;
	
	@GetMapping("all")
	public List<Stranger> findAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Stranger findById(@PathVariable("id") int id) {
		return repo.findById(id).orElse(null);
	}
	
	
	@GetMapping("count")
	public Long count() {
		return repo.count();
		
	}
	

}
