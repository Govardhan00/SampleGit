package com.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetails extends JpaRepository<CarDetails, Integer> {

}
