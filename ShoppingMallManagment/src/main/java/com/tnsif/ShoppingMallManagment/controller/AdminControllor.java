package com.tnsif.ShoppingMallManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingMallManagment.entity.Admin;
import com.tnsif.ShoppingMallManagment.repository.AdminRepository;

@RestController
@RequestMapping("/adminservice")

public class AdminControllor {
	@Autowired
	AdminRepository repo;

	@PostMapping
	public Admin addEmployee(@RequestBody Admin adm) {
		return repo.save(adm);
	}

	@GetMapping
	public List<Admin> getEmployee() {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public Admin getStudentByid(@PathVariable Long id) {
		return repo.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		repo.deleteById(id);
	}

	@PutMapping("/emp{id}")
	public Admin updateStudent(@PathVariable Long id, @RequestBody Admin adm) {
		adm.setId(id);
		return repo.save(adm);

	}

}