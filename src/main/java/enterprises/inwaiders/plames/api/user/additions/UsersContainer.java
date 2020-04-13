package enterprises.inwaiders.plames.api.user.additions;

import java.util.Set;

import enterprises.inwaiders.plames.api.user.User;

public interface UsersContainer extends Set<User>{

	public User getByNickname(String name);
	public void setUsers(Set<User> users);
	public Set<User> getUsers();
}
