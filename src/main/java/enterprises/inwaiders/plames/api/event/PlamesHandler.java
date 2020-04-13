package enterprises.inwaiders.plames.api.event;

public interface PlamesHandler<E extends PlamesEvent> {

	public void run(E event);
}
