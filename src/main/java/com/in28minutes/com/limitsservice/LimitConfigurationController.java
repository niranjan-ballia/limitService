package com.in28minutes.com.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.com.limitsservice.beans.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromconfiguration() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}

}
