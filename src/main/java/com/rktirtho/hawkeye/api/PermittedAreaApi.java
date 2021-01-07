package com.rktirtho.hawkeye.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.hawkeye.model.PermitArea;
import com.rktirtho.hawkeye.repository.PermitAreaRepo;

@RestController
@RequestMapping("api")
public class PermittedAreaApi {
	
	@Autowired
	PermitAreaRepo permitAreaRepo;
	
	
	
	
	/**
	 * This method is used to get all permitted area of all person
	 * @return {@link List<PermitArea>}
	 */
	@GetMapping("permit-areas")
	public List<PermitArea> getAll(){
		return permitAreaRepo.findAll();
	}
	
	@GetMapping("permit-area/person/{id}")
	public List<PermitArea> findByPersonId(@PathVariable("id")int id){
		return permitAreaRepo.findPermitAreaByPersonId(id);
	}

}
