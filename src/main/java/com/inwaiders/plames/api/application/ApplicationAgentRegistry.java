package com.inwaiders.plames.api.application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ApplicationAgentRegistry {

	private static Map<String, ApplicationAgent> agents = new HashMap<>();

	public static void register(ApplicationAgent agent) {
		
		if(agents.containsKey(agent.getTag())) {
	
			throw new RuntimeException(agent.getDisplayName()+" try to register by tag "+agent.getTag()+", tag already binded!");
		}
		
		agents.put(agent.getTag(), agent);
	}
	
	public static ApplicationAgent getBySign(String sign) {
		
		ApplicationAgent agent = getByTag(sign);
	
		if(agent != null) return agent;

		return null;
	}
	
	public static ApplicationAgent getByTag(String tag) {
		
		return agents.get(tag);
	}
	
	public static Collection<ApplicationAgent> getAll() {
		
		return agents.values();
	}
}
