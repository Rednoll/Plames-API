package enterprises.inwaiders.plames.api.procedure;

public class ProcedureStageRunResult {

	private ProcedureStageStatus status = null;
	private String message = null;
	
	public ProcedureStageRunResult(ProcedureStageStatus status, String message) {
		this(status);
		
		this.message = message;
	}

	public ProcedureStageRunResult(ProcedureStageStatus status) {
		
		this.status = status;
	}
	
	public String getMessage() {
	
		return this.message;
	}
	
	public ProcedureStageStatus getStatus() {
		
		return this.status;
	}
}
