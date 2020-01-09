package com.service;

import java.util.List;

import com.model.AdminDetails;

public interface AdminService {
	public void createAdmin(AdminDetails adminDetails);

	public List<AdminDetails> readAllAdmin();

	public int updateAdmin(AdminDetails adminDetails);

	public AdminDetails deleteAdminById(int vendorId);

}