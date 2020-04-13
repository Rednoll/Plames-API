package enterprises.inwaiders.plames.api.command;

public class CommandException extends Exception{

	private static final long serialVersionUID = 1L;

	private Object[] localeArgs = null;

	public CommandException(String desc, Object... localeArgs) {
		super(desc);
		
		this.localeArgs = localeArgs;
	}

	public Object[] getLocaleArgs() {

		return this.localeArgs;
	}
}
