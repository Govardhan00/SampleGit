package com.incentive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incentive.entities.IncentiveDetails;

public interface IncentiveDetailsRepository extends JpaRepository<IncentiveDetails, Integer> {

}
