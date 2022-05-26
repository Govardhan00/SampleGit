package com.incentive.service;

import java.util.List;
import java.util.Optional;

import com.incentive.entities.CustomerDetails;
import com.incentive.exceptions.CustomerAlreadyExistException;
import com.incentive.exceptions.CustomerNotFoundException;

public interface CustomerDetailsServive {
	void addCustomer(CustomerDetails cust) throws CustomerAlreadyExistException;

	List<CustomerDetails> viewAllCusts();

	Optional<CustomerDetails> getCustByID(String custContactNo) throws CustomerNotFoundException;

	void updateCustomer(CustomerDetails cust);

}
