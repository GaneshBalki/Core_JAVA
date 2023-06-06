package com.demo.beans;

public class Rectangle extends Shapes{
    private int heigth,width;
	public Rectangle() {
	super();
	}
	public Rectangle(String id,String color,int height,int width) {
		super(color,id);
		this.heigth=height;
		this.width=width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape Rectangle "+super.toString()+" Heigth = " + heigth + " Width = " + width;
	}
	@Override
	public float calArea() {
		return width*heigth;
	}
	@Override
	public float calCircum() {
		return 2*(width+heigth);
	}
	

}
