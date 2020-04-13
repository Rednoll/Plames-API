package enterprises.inwaiders.plames.api.messenger;

import enterprises.inwaiders.plames.api.messenger.message.MessageReceiver;
import enterprises.inwaiders.plames.api.messenger.message.MessageSender;

public interface Messenger<P extends MessageReceiver & MessageSender> {
	
	/*
	public void receiveMessage(P profile, String text) throws MessengerException;
	
	public boolean sendRawMessage(P profile, String text) throws MessengerException;
	public boolean sendMessage(Message message) throws MessengerException;
	*/
	
	public void setActive(boolean active);
	public boolean isActive();
	
	public String getName();
	public String getType();
	
	public void save();
	public void delete();
	
	public String getWebDescription();
	
	public Long getId();
}
