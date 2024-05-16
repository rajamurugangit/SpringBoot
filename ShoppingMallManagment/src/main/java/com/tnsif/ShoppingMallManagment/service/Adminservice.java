package com.tnsif.ShoppingMallManagment.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.tnsif.ShoppingMallManagment.entity.Admin;

@Service
public interface Adminservice {


	 List<Admin> getAdmin();
	 Admin getAdmin(Long id);
	 Admin createAdmin (Admin admin);
	 Admin updateAdmin(Admin admin, Long id);
	 void deleteAdmin (Long id);

}