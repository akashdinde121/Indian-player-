package com.model;

public class Players {

	private int id;
	private String Name;
	private int century;
	private int hscore;
	
	public Players(int id, String name, int hscore, int century) {
		this.id = id;
		this.Name = name;
		this.century = century;
		this.hscore = hscore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCentury() {
		return century;
	}
	public void setCentury(int century) {
		this.century = century;
	}
	public int getHscore() {
		return hscore;
	}
	public void setHscore(int hscore) {
		this.hscore = hscore;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", Name=" + Name + ", century=" + century + ", hscore=" + hscore + "]";
	}
	
	
	
}
