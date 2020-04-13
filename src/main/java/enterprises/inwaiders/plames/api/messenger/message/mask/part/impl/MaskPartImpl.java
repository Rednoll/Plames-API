package enterprises.inwaiders.plames.api.messenger.message.mask.part.impl;

import enterprises.inwaiders.plames.api.messenger.message.Message;
import enterprises.inwaiders.plames.api.messenger.message.mask.part.MaskPart;

public abstract class MaskPartImpl implements MaskPart{

	protected String leftScope = null;
	protected String rightScope = null;
	
	public abstract String compile(Message message);
	
	@Override
	public final String gen(Message message) {
		
		return scope(compile(message));
	}
	
	public String scope(String text) {
		
		return this.leftScope+text+this.rightScope;
	}
	
	public void setScopes(String left, String right) {
		
		this.leftScope = left;
		this.rightScope = right;
	}
}
