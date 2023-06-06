package com.demo.beans;

public class Triangle extends Shapes {
	private int base,height,side1,side2;
	public Triangle() {
		super();
	}
	public Triangle(String id,String color,int base,int heigth,int side1,int side2) {
		super(color,id);
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	@Override
	public String toString() {
		return "Shape Triangle "+super.toString()+" Base = " + base + " Height = " + height + " Side1 = " + side1 + "Side2 = " + side2;
	}
	@Override
	public float calArea() {
		return (float) (0.5*base*height);
	}
	@Override
	public float calCircum() {
		return base+side1+side2;
	}
	

}
