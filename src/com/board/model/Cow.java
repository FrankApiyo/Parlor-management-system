/**
 * 
 */
package com.board.model;

import java.util.ArrayList;

/**
 * @author opiyo
 *
 */
public class Cow {
	private String name, tag;
	private ArrayList<Double> milkList = new ArrayList<>();
	public Cow(String name, String tag, ArrayList<Double> milkList){
			this.name = name;
			this.tag = tag;
			this.milkList = milkList;
	}
	public String getName(){ return name; }
	public String getTag(){ return tag; }
	public ArrayList<Double> getMilkList(){
		return milkList;
	}
}
