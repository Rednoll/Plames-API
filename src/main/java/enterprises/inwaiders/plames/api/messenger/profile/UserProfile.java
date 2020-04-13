package enterprises.inwaiders.plames.api.messenger.profile;

import enterprises.inwaiders.plames.api.messenger.keyboard.MessengerKeyboard;
import enterprises.inwaiders.plames.api.messenger.message.MessageReceiver;
import enterprises.inwaiders.plames.api.messenger.message.MessageSender;
import enterprises.inwaiders.plames.api.procedure.Procedure;
import enterprises.inwaiders.plames.api.user.User;

public interface UserProfile extends MessageReceiver, MessageSender {
	
	public boolean isOnline();
	
	public void fromUser(String text);
	
	public void setKeyboard(MessengerKeyboard keyboard);
	public MessengerKeyboard getKeyboard();
	
	public void setCurrentProcedure(Procedure procedure);
	public Procedure getCurrentProcedure();
	
	public void setUser(User user);
	public User getUser();
	
	public void setAccessible(boolean access);
	public boolean isAccessible();
	
	public void save();
	public void delete();
	
	public String getHumanSign();
	
	public String getMessengerType();
	public Long getId();
}
