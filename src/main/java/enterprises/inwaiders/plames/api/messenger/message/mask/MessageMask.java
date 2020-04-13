package enterprises.inwaiders.plames.api.messenger.message.mask;

import enterprises.inwaiders.plames.api.messenger.message.Message;

public interface MessageMask {

	public String apply(Message message);
}
