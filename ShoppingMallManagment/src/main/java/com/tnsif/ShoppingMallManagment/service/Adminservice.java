package com.tnsif.ShoppingMallManagment.service;

import java.util.List;

import com.tnsif.ShoppingMallManagment.entity.Admin;

public interface Adminservice {
	
	public List<Admin> getAdmin();
	public Admin getAdmin(Long id);
	public Admin createAdmin (Admin admin);
	public Admin updateAdmin(Admin admin, Long id);
	public void deleteAdmin (Long id);

}
