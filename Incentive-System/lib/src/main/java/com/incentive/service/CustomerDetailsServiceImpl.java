package com.incentive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.incentive.entities.CustomerDetails;
import com.incentive.exceptions.CustomerAlreadyExistException;
import com.incentive.exceptions.CustomerNotFoundException;
import com.incentive.repository.CustomerDetailsRepository;

public class CustomerDetailsServiceImpl implements CustomerDetailsServive {

	@Autowired
	CustomerDetailsRepository custrepo;

	@Override
	public void addCustomer(CustomerDetails cust) {
		Optional<CustomerDetails> customerdetails = custrepo.findById(cust.getCustContactNo());
		System.out.println(customerdetails);
		if (!customerdetails.isEmpty())
			throw new CustomerAlreadyExistException();
		custrepo.save(cust);
	}

	@Override
	public List<CustomerDetails> viewAllCusts() {
		return custrepo.findAll();
	}

	@Override
	public Optional<CustomerDetails> getCustByID(String custContactNo) {
		Optional<CustomerDetails> cust = custrepo.findById(custContactNo);
		if (cust.isEmpty())
			throw new CustomerNotFoundException();
		return cust;
	}

	@Override
	public void updateCustomer(CustomerDetails cust) {
		custrepo.save(cust);

	}

}
