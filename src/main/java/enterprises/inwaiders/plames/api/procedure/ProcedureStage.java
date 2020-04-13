package enterprises.inwaiders.plames.api.procedure;

public interface ProcedureStage<P extends Procedure> {

	public ProcedureStageRunResult run(P procedure, String... args);
}