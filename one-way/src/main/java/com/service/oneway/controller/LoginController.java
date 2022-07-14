package com.service.oneway.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.oneway.entities.UserLogin;
import com.service.oneway.services.UserServices;

@RestController
public class LoginController {
	
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);
	
	@Autowired
	UserServices userServices;
	
	@PostMapping("/userLogin")
	public void userLogin(@RequestBody UserLogin request) {
		LOGGER.info("user login controller :: "+request.getUserId());
		userServices.loginService(request);
	}

}
