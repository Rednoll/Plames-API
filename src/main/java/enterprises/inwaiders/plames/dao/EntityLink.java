package enterprises.inwaiders.plames.dao;

public class EntityLink {
	
	private String entityName = null;
	private long entityId = -1;

	public EntityLink() {
		
	}
	
	public EntityLink(String entityName, long entityId) {
		this();
		
		this.entityName = entityName;
		this.entityId = entityId;
	}
	
	public long getEntityId() {
		
		return this.entityId;
	}
	
	public String getEntityName() {
		
		return this.entityName;
	}
}
