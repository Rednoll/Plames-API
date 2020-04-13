package enterprises.inwaiders.plames.dao;

public interface HighLevelRepository<T> {

	public T getById(Long id);
	
	public EntityLink getLink(T entity);
	
	public void save(T entity);
}
