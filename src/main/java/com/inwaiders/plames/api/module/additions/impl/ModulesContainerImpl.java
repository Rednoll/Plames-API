package com.inwaiders.plames.api.module.additions.impl;

import java.util.Collection;
import java.util.HashSet;

import com.inwaiders.plames.api.module.Module;
import com.inwaiders.plames.api.module.additions.ModulesContainer;

public class ModulesContainerImpl extends HashSet<Module> implements ModulesContainer{

	public ModulesContainerImpl() {
		
	}
	
	public ModulesContainerImpl(Collection<? extends Module> toCopy) {
		super(toCopy);
		
	}
	
	@Override
	public ModulesContainer getByType(String type) {
		
		ModulesContainer result = new ModulesContainerImpl();
		
		for(Module module : this) {
			
			if(type != null) {
				
				if(module.getType().equals(type)) {
					
					result.add(module);
				}
			}
			else {
				
				if(module.getType() == null) {
					
					result.add(module);
				}
			}
		}
		
		return result;
	}
	
	public ModulesContainer getNonDeepCopy() {
		
		return new ModulesContainerImpl(this);
	}
}
