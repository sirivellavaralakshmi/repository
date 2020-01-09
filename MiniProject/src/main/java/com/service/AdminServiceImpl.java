package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.AdminDAO;
import com.model.AdminDetails;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO adminDAO;

	public AdminDAO getAdminDAO() {
		return adminDAO;
	}

	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public void createAdmin(AdminDetails adminDetails) {
		System.out.println("hoooo!");
		this.adminDAO.createAdmin(adminDetails);
		System.out.println("service layer");

	}

	@Override
	@Transactional
	public List<AdminDetails> readAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public int updateAdmin(AdminDetails adminDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public AdminDetails deleteAdminById(int vendorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
