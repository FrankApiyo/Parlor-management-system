/**
 * 
 */
package com.board.model;

/**
 * @author opiyo
 *
 */
public class Cow {
	private String name, tag;
	//TODO -- Must change this to MilkList so as to implement our model fully
	private MilkList milkList = new MilkList();
	public Cow(String name, String tag, MilkList milkList){
			this.name = name;
			this.tag = tag;
			this.milkList = milkList;
	}
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
