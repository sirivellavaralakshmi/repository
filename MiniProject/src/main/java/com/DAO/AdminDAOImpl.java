package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.model.AdminDetails;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {

		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void createAdmin(AdminDetails adminDetails) {
		System.out.println("wow!");
		Session currentSession = sessionFactory.openSession();
		currentSession.save(adminDetails);
		System.out.println("dao");
	}

	@Override
	public List<AdminDetails> readAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateAdmin(AdminDetails adminDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdminDetails deleteAdminById(int vendorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
