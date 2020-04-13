package enterprises.inwaiders.plames.api.module.additions;

import java.util.Set;

import enterprises.inwaiders.plames.api.module.Module;

public interface ModulesContainer extends Set<Module>{

	public ModulesContainer getByType(String type);
	public ModulesContainer getNonDeepCopy();
}
