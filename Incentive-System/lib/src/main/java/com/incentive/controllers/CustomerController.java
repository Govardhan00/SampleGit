package com.incentive.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incentive.entities.CustomerDetails;
import com.incentive.service.CustomerDetailsServiceImpl;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
	CustomerDetailsServiceImpl service;

	@PostMapping
	public ResponseEntity<String> addDepartment(@RequestBody CustomerDetails cust) {
		service.addCustomer(cust);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<CustomerDetails>> getAllCusts() {
		List<CustomerDetails> custList = service.viewAllCusts();
		return new ResponseEntity<List<CustomerDetails>>(custList, HttpStatus.OK);
	}

	@GetMapping("/id/{custContactNo}")
	public ResponseEntity<Optional<CustomerDetails>> getCustById(@PathVariable String custContactNo) {
		Optional<CustomerDetails> cust = service.getCustByID(custContactNo);
		return new ResponseEntity<Optional<CustomerDetails>>(cust, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String> editCustomer(@RequestBody CustomerDetails cust) {
		service.updateCustomer(cust);
		return new ResponseEntity<String>("updated", HttpStatus.OK);
	}

}