package enterprises.inwaiders.plames.dao.user;

import enterprises.inwaiders.plames.api.user.User;
import enterprises.inwaiders.plames.dao.HighLevelRepository;

public abstract class UserHlRepository<T extends User> implements HighLevelRepository<T> {

	private static UserHlRepository repository = null;
	
	public abstract T getById(Long id);
	
	public static void setRepository(UserHlRepository rep) {
		
		repository = rep;
	}
	
	public static UserHlRepository getRepository() {
		
		return repository;
	}
}
