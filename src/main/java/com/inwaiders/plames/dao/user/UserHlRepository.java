package com.inwaiders.plames.dao.user;

import com.inwaiders.plames.api.user.User;
import com.inwaiders.plames.dao.HighLevelRepository;

public abstract class UserHlRepository<T extends User> implements HighLevelRepository<T> {

	private static UserHlRepository repository = null;
	
	public abstract T getById(Long id);
	
	public static void setRepository(UserHlRepository rep) {
		
		repository = rep;
	}
	
	public static UserHlRepository getRepository() {
		
		return repository;
	}
}
