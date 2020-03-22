package com.inwaiders.plames.dao.locale;

import java.util.List;
import java.util.Locale;

import com.inwaiders.plames.api.locale.PlamesLocale;
import com.inwaiders.plames.dao.HighLevelRepository;

public abstract class PlamesLocaleHlRepository<T extends PlamesLocale> implements HighLevelRepository<T> {

	private static PlamesLocaleHlRepository repository = null;
	private static PlamesLocale systemLocale = null;
	
	public abstract PlamesLocale getLocale(Locale locale);
	public abstract List<PlamesLocale> getAll();
	
	public static void setSystemLocale(PlamesLocale locale) {
		
		systemLocale = locale;
	}
	
	public static PlamesLocale getSystemLocale() {
		
		return systemLocale;
	}
	
	public static void setRepository(PlamesLocaleHlRepository rep) {
		
		repository = rep;
	}
	
	public static PlamesLocaleHlRepository getRepository() {
		
		return repository;
	}
}
