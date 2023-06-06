package com.demo.beans;

public class Square extends Shapes{
    private int side;
	public Square() {
		super();
	}
	public Square(String id,String color,int side) {
		super(color,id);
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Shape Square "+super.toString()+"Side = " + side;
	}
	@Override
	public float calArea() {
		return side*side;
	}
	@Override
	public float calCircum() {
		return 4*side;
	}
	

}
