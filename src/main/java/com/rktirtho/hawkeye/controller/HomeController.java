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
	public String getAliens(Model m) {

		return "index";

	}

	@RequestMapping("/api/permitted")
	public String getPermittedApi(Model m) {
		return "permitted";

	}
	@RequestMapping("/api/security")
	public String getSecurityApi(Model m) {
		return "security";

	}
	@RequestMapping("/api/monitoring")
	public String getmonitoringApi(Model m) {
		return "monitoring";
		
	}
	@RequestMapping("/api/stranger")
	public String getStrangerApi(Model m) {
		return "stranger";
		
	}
	@RequestMapping("/api/organization")
	public String getOrganizationApi(Model m) {
		return "organization";
		
	}

}
