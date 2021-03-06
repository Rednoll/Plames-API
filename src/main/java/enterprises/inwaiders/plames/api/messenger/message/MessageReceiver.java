package enterprises.inwaiders.plames.api.messenger.message;

import enterprises.inwaiders.plames.api.messenger.MessengerException;

public interface MessageReceiver {

	public boolean receiveMessage(Message message) throws MessengerException;

	public String getName();
	
	public Long getId();
}
