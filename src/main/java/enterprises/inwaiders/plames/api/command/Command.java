package enterprises.inwaiders.plames.api.command;

import java.util.Collection;
import java.util.Set;

public interface Command {

//	public void run(String... args);

	public void setRequireAccess(boolean i);
	public boolean isRequireAccess();
	
	public void addAliases(String... aliases);
	public void addAliases(Collection<String> aliases);
	
	public void setAliases(Set<String> aliases);
	public Set<String> getAliases();
}
