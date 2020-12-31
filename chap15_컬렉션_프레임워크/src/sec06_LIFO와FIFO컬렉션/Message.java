package sec06_LIFO와FIFO컬렉션;

public class Message {
	public String command;
	public String to;
	public String media;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
		this.media = command.replace("send", "");
	}
}