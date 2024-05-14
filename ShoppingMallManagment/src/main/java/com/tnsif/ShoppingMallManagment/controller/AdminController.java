package com.tnsif.ShoppingMallManagment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingMallManagment.service.Adminservice;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	
	@Autowired
	Adminservice service;

	
	
	
	

}
