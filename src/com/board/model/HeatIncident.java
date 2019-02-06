package com.board.model;

public class HeatIncident {
	private int heatId;
	private String cowTag;
	private int SessionId;
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
