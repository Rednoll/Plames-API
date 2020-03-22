package com.inwaiders.plames.api.procedure;

import java.util.List;

public interface Procedure<S extends ProcedureStage> {

	public void begin();
	public void abort();
	
	public void onBegin();
	public void onComplete();
	public void onFail();
	public void onLifetimeEnd();
	
	public boolean runNextStage(String... args);
	public void goToStage(int stageIndex);
	public void skipStages(int stagesCount);
	public boolean hasNextStage();
	public int getStagesCount();

	public void setAutoDelete(boolean autoDelete);
	public boolean getAutoDelete();
	
	public List<S> getStages();
	
	public boolean isBegan();
	public boolean isEnd();
	
	public void save();
	public void delete();
	
	public void setLifetime(long lifetime);
	public long getLifetime();

	public long getCreateTime();
	
	public Long getId();
}
