package com.inwaiders.plames.dao.messenger.keyboard;

import com.inwaiders.plames.api.messenger.keyboard.MessengerKeyboard;
import com.inwaiders.plames.dao.HighLevelRepository;
import com.inwaiders.plames.dao.locale.PlamesLocaleHlRepository;

public abstract class KeyboardHlRepository<T extends MessengerKeyboard> implements HighLevelRepository<T> {

	private static KeyboardHlRepository repository = null;
	
	public abstract void save(MessengerKeyboard keyboard, long id);
	public abstract MessengerKeyboard load(long id);

	public static KeyboardHlRepository getRepository() {
		
		return repository;
	}
	
	public static void setRepository(KeyboardHlRepository rep) {
		
		repository = rep;
	}
}
