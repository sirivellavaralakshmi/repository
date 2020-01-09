package com.DAO;

import java.util.List;

import com.model.AdminDetails;

public interface AdminDAO {
	public abstract void createAdmin(AdminDetails adminDetails);

	public abstract List<AdminDetails> readAllAdmin();

	public abstract int updateAdmin(AdminDetails adminDetails);

	public abstract AdminDetails deleteAdminById(int vendorId);

}