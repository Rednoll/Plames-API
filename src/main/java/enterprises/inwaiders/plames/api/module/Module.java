package enterprises.inwaiders.plames.api.module;

public interface Module {

	public void preInit();
	public void init();
	public void postInit();
	
	public String getName();
	public String getVersion();
	public String getDescription();
	
	public String getType();
	public String getLicenseKey();
	public long getSystemVersion();
	
	public boolean inActiveSide();
	
	public void setStatus(ModuleStatus status);
	public ModuleStatus getStatus();
	
	public long getId();
}
