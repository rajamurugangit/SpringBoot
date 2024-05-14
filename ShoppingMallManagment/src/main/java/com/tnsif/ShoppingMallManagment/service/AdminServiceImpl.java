package com.tnsif.ShoppingMallManagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tnsif.ShoppingMallManagment.entity.Admin;
import com.tnsif.ShoppingMallManagment.repository.AdminRepository;

public class AdminServiceImpl implements Adminservice {
	
	
	@Autowired
	AdminRepository AdminRepo;
	
	
	
	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return AdminRepo.findAll();
	}

	@Override
	public Admin getAdmin(Long id) {
		// TODO Auto-generated method stub
		Optional<Admin>  Admin= AdminRepo.findById (id);
		if(Admin.isPresent())
		{
			return Admin.get();
		}
		else 
		{
			return null;
		}
	}
	
	

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepo.save(admin);	
	}

	
	
	@Override
	public Admin updateAdmin(Admin admin, Long id) {
		// TODO Auto-generated method stub
		Optional<Admin>  a= AdminRepo.findById(id);
		if(a.isPresent())
		{
			Admin updateAdmin = a.get();
			updateAdmin.setId(id);		
			//some error using getname
		}
		return null;
	}

	
	
	@Override
	public void deleteAdmin(Long id) {
		// TODO Auto-generated method stub
		Optional<Admin>  a= AdminRepo.findById(id);
		if(a.isPresent())
		{
			AdminRepo.deleteById(id);
		}
		
	}

}
