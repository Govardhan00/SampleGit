package com.incentive.service;

import java.util.List;

import com.incentive.entities.CarDetails;

public interface CarDetialsService {
	void addCarDetails(CarDetails car);
	List<CarDetails> viewAllCarDetails();
	List<CarDetails> viewCarDetailsByChassisNumber(int chassisno);
	void updateCarDetails(CarDetails car);
	void deleteCarDetails(int chassisno); 
}
