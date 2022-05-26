package com.incentive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incentive.entities.CarCompany;
import com.incentive.repository.CarCompanyRepository;
@Service
public class CarCompanyServiceImpl implements CarCompanyService {
	@Autowired
	CarCompanyRepository carcorepo;

	@Override
	public void addCarCompany(CarCompany comp) {
		CarCompany comp1 = new CarCompany();
		
		
	}

	@Override
	public List viewIncentiveDetails(int incentivedetails) {
		
		List List = viewIncentiveDetails(5);
		return List;
	}

	@Override
	public String viewDealerId(int dealerid) {
	
		
		String String = viewDealerId(5);
		return String ;
	}

	@Override
	public List viewCustomerDetails(int customerdetails) {
		List List = viewCustomerDetails(5);
		return List;
	}
	
	}


