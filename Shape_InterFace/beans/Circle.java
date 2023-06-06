package com.demo.beans;

public class Circle extends Shapes {

	private int radius;
	public Circle() {
		super();
	}
	
	public Circle(String id,String color,int radius) {
		super(color,id);
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Shape Circle "+super.toString()+" Radius = " + radius;
	}

	@Override
	public float calArea() {
		return 2*(float)Math.PI*radius*radius;
	}

	@Override
	public float calCircum() {
		return 2*(float)Math.PI*radius;
	}

}
