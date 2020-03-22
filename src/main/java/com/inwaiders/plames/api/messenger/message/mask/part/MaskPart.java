package com.inwaiders.plames.api.messenger.message.mask.part;

import com.inwaiders.plames.api.messenger.message.Message;

public interface MaskPart {

	public String gen(Message message);
	
	public void setScopes(String left, String right);
}
