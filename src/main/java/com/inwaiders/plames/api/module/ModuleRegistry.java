package com.inwaiders.plames.api.module;

import com.inwaiders.plames.api.module.additions.ModulesContainer;
import com.inwaiders.plames.api.module.additions.impl.ModulesContainerImpl;

public class ModuleRegistry {
	
	private static volatile ModulesContainer modules = new ModulesContainerImpl();
	
	public static void register(Module module) {
		
		if(modules.contains(module)) {
			
			throw new RuntimeException("Module "+module.getName()+":"+module.getId()+" double registration detected!");
		}
		
		modules.add(module);
	}
	
	public static Module getById(long id) {
		
		for(Module module : modules) {
			
			if(module.getId() == id) {
				
				return module;
			}
		}
		
		return null;
	}
	
	public static ModulesContainer getModules() {
		
		return modules;
	}
}
