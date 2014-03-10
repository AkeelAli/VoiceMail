/**
 * A message left by the caller.
 * @author Akeel
 *
 */
public class Message {
	/**
	 * Construct a message object.
	 * @param messageText the message text
	 */
	public Message(String messageText) {
		text = messageText;
	}
	
	/**
	 * Get the message text
	 * @return message text
	 */
	public String getText() {
		return text;
	}
	
	private String text;
}
