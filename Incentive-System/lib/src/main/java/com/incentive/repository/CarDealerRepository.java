package com.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incentive.entities.CarDealer;

@Repository
public interface CarDealerRepository extends  JpaRepository<CarDealer, Integer> {

}
