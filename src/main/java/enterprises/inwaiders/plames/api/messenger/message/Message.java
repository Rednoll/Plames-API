package enterprises.inwaiders.plames.api.messenger.message;

import enterprises.inwaiders.plames.api.messenger.keyboard.MessengerKeyboard;
import enterprises.inwaiders.plames.api.messenger.message.mask.MessageMask;

public interface Message {

	public void send();
	
	public void setKeyboard(MessengerKeyboard keyboard);
	public MessengerKeyboard getKeyboard();
	
	public void setMask(MessageMask mask);
	public MessageMask getMask();
	
	public void setSender(MessageSender sender);
	public MessageSender getSender();
	
	public void setReceiver(MessageReceiver receiver);
	public MessageReceiver getReceiver();
	
	public void setText(String text);
	public String getText();
	
	public String getDisplayText();
	
	public void setDelivered(boolean delivered);
	public boolean isDelivered();
	
	public void setCreationDate(long date);
	public long getCreationDate();
	
	public void setDeliveryDate(long date);
	public long getDeliveryDate();
	
	public void save();
	public void delete();
	
	public Long getId();
}
