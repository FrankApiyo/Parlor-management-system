/**
 * 
 */
package com.board.model;

import java.util.Date;
import javax.persistence.*;

/**
 * @author opiyo
 *
 */
@Entity
@Table
@IdClass(CowPK.class)
public class Cow {
	@Id
	@Column
	private String name;
	
	@Id
	@Column
	private String tag;
	
	@Column
	private Date dob;
	
	public Cow() {}
	public Cow(String name, String tag){
		this.name = name;
		this.tag = tag;
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

	public void setName(String name) {
		this.name = name;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName(){ return name; }
	public String getTag(){ return tag; }
}
