package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DAO.AdminDAO;
import com.model.AdminDetails;
import com.service.AdminService;

@Controller
@Transactional
public class UserController {
	@Autowired
	private AdminDAO adminDAO;
	private AdminService adminService;

	@RequestMapping("/RegistrationLink")
	public String registrationLink() {
		System.out.println("you are in regoistrationLink of controller");
		return "RegistrationLink";

	}

	@RequestMapping("/LoginPage")
	public String loginPage() {
		return "LoginPage";

	}

	@PostMapping(value = "InsertAdmin")
	public String createAdmin(@ModelAttribute AdminDetails adminDetails) {

		System.out.println("hi");
		System.out.println(adminDetails.getVendorId());

		// this.adminService.createAdmin(adminDetails);
		adminService.createAdmin(adminDetails);
		System.out.println("hi");
		return "insert";

	}

}