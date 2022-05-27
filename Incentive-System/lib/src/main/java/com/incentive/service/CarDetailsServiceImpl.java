package com.incentive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incentive.entities.CarDetails;
import com.incentive.repository.CarDetailsRepository;

@Service
public class CarDetailsServiceImpl implements CarDetialsService {

	@Override
	public void addCarDetails(CarDetails car) {
		
		
	}

	@Override
	public List<CarDetails> viewAllCarDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CarDetails> viewCarDetailsByChassisNumber(int chassisno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCarDetails(CarDetails car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCarDetails(int chassisno) {
		// TODO Auto-generated method stub
		
	}

}
