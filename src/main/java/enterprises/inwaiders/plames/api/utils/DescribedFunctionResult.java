package enterprises.inwaiders.plames.api.utils;

public class DescribedFunctionResult {

	public static DescribedFunctionResult OK = new DescribedFunctionResult(Status.OK, null);
	public static DescribedFunctionResult ERROR = new DescribedFunctionResult(Status.ERROR, null);
	
	private Status status = null;
	private String description = null;
	private Object[] localeArgs = null;
	
	public DescribedFunctionResult(Status status, String description, Object... localeArgs) {
		
		this.status = status;
		this.description = description;
		this.localeArgs = localeArgs;
	}
	
	public Object[] getLocaleArgs() {
	
		return this.localeArgs;
	}
	
	public String getDescription() {
		
		return this.description;
	}
	
	public Status getStatus() {
		
		return this.status;
	}
	
	public static enum Status {
		
		OK, ERROR;
	}
}
