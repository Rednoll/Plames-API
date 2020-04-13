package enterprises.inwaiders.plames.api.messenger.keyboard;

public interface KeyboardCommandButton extends KeyboardButton {

	public void setCommand(String command);
	public String getCommand();
}
