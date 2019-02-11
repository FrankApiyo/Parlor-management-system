package com.board.model;

public class PersonelEntry {
	private int sessionId;
	private String personelId;
	public PersonelEntry(int sessionId, String personelId) {
		super();
		this.sessionId = sessionId;
		this.personelId = personelId;
	}
	public PersonelEntry() {
		
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getPersonelId() {
		return personelId;
	}
	public void setPersonelId(String personelId) {
		this.personelId = personelId;
	}
	
}
