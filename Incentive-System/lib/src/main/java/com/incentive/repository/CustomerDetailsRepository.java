package com.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incentive.entities.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, String> {
	@Query(value = "select cust from CustomerDetails cust where cust.custContactNo=?1")
	CustomerDetails getCustByID(String CustContactNO);
}
