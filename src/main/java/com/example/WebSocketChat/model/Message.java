package com.example.WebSocketChat.model;

public class Message {

	private String message;
	private String name;
	private MessageType type;
	
	
	public enum MessageType{
		CHAT,LEAVE,JOIN
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public MessageType getType() {
		return type;
	}


	public void setType(MessageType type) {
		this.type = type;
	}
	
}
