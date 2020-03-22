package com.inwaiders.plames.api.messenger.keyboard;

import java.util.List;

import com.inwaiders.plames.dao.messenger.keyboard.KeyboardHlRepository;

public interface MessengerKeyboard {

	public void setOnetime(boolean i);
	public boolean isOnetime();
	
	public void setButton(int row, int column, KeyboardButton button);
	public List<List<KeyboardButton>> getButtonsMatrix();

	public KeyboardButton getButtonByLabel(String label);
	public KeyboardButton getButtonByMark(String mark);
	
	public default void save(long id) {
		
		KeyboardHlRepository.getRepository().save(this, id);
	}
	
	public static MessengerKeyboard load(long id) {
		
		return KeyboardHlRepository.getRepository().load(id);
	}
}
