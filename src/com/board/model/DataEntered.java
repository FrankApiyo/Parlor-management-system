package com.board.model;

import java.sql.Date;
import java.util.ArrayList;

public class DataEntered extends ArrayList<DataEntry>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean getEntered(String period, Date date)throws Exception {
		period = period.trim().toLowerCase();
		//if period is neither pm nor am we will throw and exception so far high it toches the sky
		if(period != "am" && period != "pm")
			throw new Exception();
		for(DataEntry i : this) {
			if(i.getDate() == date) {
				boolean am = period == "am";
				boolean pm = period == "pm";
				if(i.isAm() && am)
					return true;
				if(i.isPm() && pm)
					return false;
			}
		}
		return false;
	}
}
