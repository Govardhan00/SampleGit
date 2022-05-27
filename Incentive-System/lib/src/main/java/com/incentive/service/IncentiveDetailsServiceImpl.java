package com.incentive.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.incentive.entities.IncentiveDetails;
import com.incentive.repository.IncentiveDetailsRepository;

public class IncentiveDetailsServiceImpl implements IncentiveDetailsService {
@Autowired
IncentiveDetailsRepository incdetrepo;

	public List<IncentiveDetails> viewIncentiveDetails() {
		this.viewIncentiveDetails();
		return Collections.emptyList() ; 
	}

}
