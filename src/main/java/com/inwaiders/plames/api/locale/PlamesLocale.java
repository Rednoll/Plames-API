package com.inwaiders.plames.api.locale;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import com.inwaiders.plames.dao.locale.PlamesLocaleHlRepository;

public interface PlamesLocale extends Serializable {
	
	public String getMessage(String tag, Object... args);
	
	public String getName();
	
	public Locale getLocale();
	
	public static String getSystemMessage(String tag, Object... args) {
		
		return PlamesLocaleHlRepository.getSystemLocale().getMessage(tag, args);
	}
	
	public static PlamesLocale getSystemLocale() {
		
		return PlamesLocaleHlRepository.getSystemLocale();
	}
	
	public static List<PlamesLocale> getAll() {
		
		return PlamesLocaleHlRepository.getRepository().getAll();
	}
	
	public static PlamesLocale getLocale(Locale locale) {
		
		return PlamesLocaleHlRepository.getRepository().getLocale(locale);
	}
}
