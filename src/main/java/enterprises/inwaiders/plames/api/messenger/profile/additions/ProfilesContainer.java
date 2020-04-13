package enterprises.inwaiders.plames.api.messenger.profile.additions;

import java.util.Set;

import enterprises.inwaiders.plames.api.messenger.profile.UserProfile;

public interface ProfilesContainer {
	
	public UserProfile pickProfile();
	
	public void setPrimaryProfile(UserProfile profile);
	public UserProfile getPrimaryProfile();
	
	public void addProfile(UserProfile profile);
	public boolean hasProfile(String messengerType);
	public UserProfile getOneProfile(String messengerType);
	public Set<UserProfile> getProfiles(String messengerType);
	public void removeProfile(UserProfile profile);
	public Set<UserProfile> getProfiles();
}
