package com.inwaiders.plames.api.user;

import com.inwaiders.plames.api.locale.PlamesLocale;
import com.inwaiders.plames.api.messenger.profile.additions.ProfilesContainer;
import com.inwaiders.plames.dao.user.UserHlRepository;

public interface User {
	
	public ProfilesContainer getProfilesContainer();
	
	public void setLocale(PlamesLocale locale);
	public PlamesLocale getLocale();
	
	public void setNickname(String nickname);
	public String getNickname();
	
	public void save();
	public void delete();
	
	public Long getId();
	
	public static User getById(Long id) {
		
		return UserHlRepository.getRepository().getById(id);
	}
}
