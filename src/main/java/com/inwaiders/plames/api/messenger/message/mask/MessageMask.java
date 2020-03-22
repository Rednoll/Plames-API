package com.inwaiders.plames.api.messenger.message.mask;

import com.inwaiders.plames.api.messenger.message.Message;

public interface MessageMask {

	public String apply(Message message);
}
