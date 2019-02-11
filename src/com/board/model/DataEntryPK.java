package com.board.model;

import java.util.*;
import java.io.Serializable;

public class DataEntryPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected boolean amorpm;
	protected Date date;
	
	public DataEntryPK() {}

	public DataEntryPK(boolean amorpm, Date date) {
		this.amorpm = amorpm;
		this.date = date;
	}
	
}
