package enterprises.inwaiders.plames.api.command;

import java.util.Set;

public abstract class CommandRegistry {

	private static CommandRegistry defaultRegistry = null;
	
	public abstract void registerCommand(Command command);
	
	public abstract Command getCommand(String aliase);
	
	public abstract Set<Command> getAll();
	
	public static void setDefaultRegistry(CommandRegistry registry) {
		
		defaultRegistry = registry;
	}
	
	public static CommandRegistry getDefaultRegistry() {
		
		return defaultRegistry;
	}
}
