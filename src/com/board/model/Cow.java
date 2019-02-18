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

	
	public Cow() {
		
	}
	public Cow(String name, String tag){
		this.name = name;
		this.tag = tag;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName(){
		return name; 
	}
	
	public String getTag(){
		return tag;
	}
}
