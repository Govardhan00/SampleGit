package com.incentive.service;

import java.util.List;

import com.incentive.entities.CarCompany;

public interface CarCompanyService {
	void addCarCompany(CarCompany comp);
	List viewIncentiveDetails(int IncentiveDetails); 
	int viewDealerId(int DealerId);
	List viewCustomerDetails(int CustomerDetails);

}
