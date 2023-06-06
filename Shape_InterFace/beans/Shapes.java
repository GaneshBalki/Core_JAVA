package com.demo.beans;

public abstract class Shapes {
  private String color;
  private String ID;
	public Shapes() {
		this.color=null;
		this.ID=null;
	}
	public Shapes(String color,String id) {
		super();
		this.color = color;
		this.ID=id;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract float calArea();
	public abstract float calCircum();
	@Override
	public String toString() {
		return "Shape ID = "+ID+" Color = " + color;
	}
	

}
