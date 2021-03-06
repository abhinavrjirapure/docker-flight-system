package com.docker.flightapp.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.docker.flightapp.entity.UserEntity;
import com.docker.flightapp.model.UserDetails;
import com.docker.flightapp.repository.UserRepository;


@Service
@Component
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private UserEntity entity;
	
	public String createUser(UserDetails requestModel) {
		logger.info("Inside createUser service method");
		entity.setUserId(requestModel.getUserId());
		entity.setUserName(requestModel.getUserName());
		entity.setPassword(requestModel.getPassword());
		entity.setRole(requestModel.getRole());
		logger.info("Creating db query");
		repo.save(entity);
		logger.info("Returning user data list");
		return null;
	}

	public Optional<UserEntity> searchUserData(long userId) {
		logger.info("Inside searchUserData service method");
		logger.info("Creating db query");
		Optional<UserEntity> list = repo.findById(userId);
		logger.info("Returning user search list");
		return list;
	}

}
