/**
 * 
 */
package com.board.model;

import java.util.Date;

/**
 * @author opiyo
 *
 */
public class Cow {
	private String name, tag;
	private Date dob;
	public Cow() {}
	public Cow(String name, String tag, MilkList milkList){
		this.name = name;
		this.tag = tag;
		this.milkList = milkList;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isLactating() {
		return lactating;
	}
	public void setLactating(boolean lactating) {
		this.lactating = lactating;
	}
	public boolean isBorn_on_farm() {
		return born_on_farm;
	}
	public void setBorn_on_farm(boolean born_on_farm) {
		this.born_on_farm = born_on_farm;
	}
	private boolean lactating, born_on_farm;
	//TODO -- Must change this to MilkList so as to implement our model fully
	private MilkList milkList = new MilkList();
	public void setName(String name) {
		this.name = name;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setMilkList(MilkList list) {
		milkList = list;
	}
	public String getName(){ return name; }
	public String getTag(){ return tag; }
	public MilkList getMilkList(){
		return milkList;
	}
}
