package com.rktirtho.hawkeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rktirtho.hawkeye.model.Organizations;
import com.rktirtho.hawkeye.repository.OrganizationsRepo;


@Controller
public class HomeController {
	

	@Autowired
	OrganizationsRepo orgRepo;
	
	
		
	@RequestMapping("/")
	public String getAliens(Model m)
	{
		
		m.addAttribute("result", orgRepo.findAll());
		
		for (Organizations org : orgRepo.findAll()) {
			System.out.println(org);
		}
		return "index";
		
	}

}
