package enterprises.inwaiders.plames.api.event;

public interface EventEngine {

	public void run(PlamesEvent event, EventStage stage);
	
	public <E extends PlamesEvent> void register(Class<E> event, EventStage stage, PlamesHandler<E> handler);

	public static EventEngine getCommonEngine() {
		
		return EventEngineFactory.getCommonEventEngine();
	}
}
