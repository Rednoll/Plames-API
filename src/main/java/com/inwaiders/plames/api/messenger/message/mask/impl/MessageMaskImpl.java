package com.inwaiders.plames.api.messenger.message.mask.impl;

import java.util.ArrayList;
import java.util.List;

import com.inwaiders.plames.api.messenger.message.Message;
import com.inwaiders.plames.api.messenger.message.mask.MessageMask;
import com.inwaiders.plames.api.messenger.message.mask.part.MaskPart;

public class MessageMaskImpl implements MessageMask{

	protected List<MaskPart> prefixes = new ArrayList<>();
	
	public MessageMaskImpl() {
	
	}
	
	@Override
	public String apply(Message message) {
		
		StringBuilder builder = new StringBuilder();
		
		for(MaskPart prefix : prefixes) {
			
			builder.append(prefix.gen(message)+" ");
		}
		
		builder.append(message.getText());
		
		return builder.toString();
	}
	
	public List<MaskPart> getPrefixes() {
		
		return this.prefixes;
	}
}
