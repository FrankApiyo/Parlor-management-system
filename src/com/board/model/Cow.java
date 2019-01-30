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
	private MilkList milkList = new MilkList();
	public Cow(String name, String tag, MilkList milkList){
			this.name = name;
			this.tag = tag;
			this.milkList = milkList;
	}
	public String getName(){ return name; }
	public String getTag(){ return tag; }
	public MilkList getMilkList(){
		return milkList;
	}
}
