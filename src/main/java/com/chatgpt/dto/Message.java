package com.chatgpt.dto;

public class Message {
	
	private String role;//for user or admin like that
	private String content;//what we want to search content.
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [role=" + role + ", content=" + content + "]";
	}
	
	
	
}
