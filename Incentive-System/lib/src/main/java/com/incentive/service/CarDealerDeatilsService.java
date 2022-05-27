package com.incentive.service;

import java.util.List;

import com.incentive.entities.CarDealer;

public interface CarDealerDeatilsService {
	void addCarDealer(CarDealer cd);
	List<CarDealer> viewAllCarDealers();
	List<CarDealer> viewCarDealersById(int id);
	void updateCarDealer(CarDealer cd);
	void deleteCarDealer(int id);

}
