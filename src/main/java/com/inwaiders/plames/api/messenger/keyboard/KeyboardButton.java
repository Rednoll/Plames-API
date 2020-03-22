package com.inwaiders.plames.api.messenger.keyboard;

import com.inwaiders.plames.api.messenger.profile.UserProfile;

public interface KeyboardButton {

	public void action(UserProfile profile);
	
	public void setMark(String mark);
	public String getMark();
	
	public void setLabel(String label);
	public String getLabel();
	
	public void setPriority(Priority type);
	public Priority getPriority();

	public static enum Priority {
		
		PRIMARY, SECONDARY;
	}
}