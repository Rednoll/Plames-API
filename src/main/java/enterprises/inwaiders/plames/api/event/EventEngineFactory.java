package enterprises.inwaiders.plames.api.event;

public abstract class EventEngineFactory {

	private static EventEngineFactory mainFactory = null;
	protected static volatile EventEngine commonEngine = null;
	
	public abstract EventEngine getEventEngineInstance();

	public static EventEngine getCommonEventEngine() {
		
		return commonEngine;
	}
	
	public static void setMainFactory(EventEngineFactory factory) {
		
		mainFactory = factory;
	}
	
	public static EventEngineFactory getMainFactory() {
		
		return mainFactory;
	}
}
