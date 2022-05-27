package com.incentive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incentive.entities.CarDealer;
import com.incentive.repository.CarDealerRepository;

@Service
public class CarDealerDetailsServiceImpl implements CarDealerDeatilsService{
	@Autowired
	CarDealerRepository cdrepo;
	
	@Override
	public void addCarDealer(CarDealer cd) {
		
		
	}

	@Override
	public List<CarDealer> viewAllCarDealers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CarDealer> viewCarDealersById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCarDealer(CarDealer cd) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteCarDealer(int id) {
		// TODO Auto-generated method stub
		
	}

}
