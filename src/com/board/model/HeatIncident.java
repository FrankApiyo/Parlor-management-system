package com.board.model;

import javax.persistence.*;

@Entity
@Table
public class HeatIncident {
	
	@Id
	@GeneratedValue
	private int heatId;
	
	@Column
	private String cowTag;
	
	@Column
	private int SessionId;
	//TODO ensure that the cow tag and sessionId added are all in existance
	public HeatIncident(int heatId, String cowTag, int sessionId) {
		super();
		this.heatId = heatId;
		this.cowTag = cowTag;
		SessionId = sessionId;
	}
	public HeatIncident() {
	}
	public int getHeatId() {
		return heatId;
	}
	public void setHeatId(int heatId) {
		this.heatId = heatId;
	}
	public String getCowTag() {
		return cowTag;
	}
	public void setCowTag(String cowTag) {
		this.cowTag = cowTag;
	}
	public int getSessionId() {
		return SessionId;
	}
	public void setSessionId(int sessionId) {
		SessionId = sessionId;
	}
}
