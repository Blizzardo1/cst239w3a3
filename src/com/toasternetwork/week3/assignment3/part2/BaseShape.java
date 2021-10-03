package com.toasternetwork.week3.assignment3.part2;

public class BaseShape implements IShape {
	protected int width;
	protected int height;
	protected String name;

	public BaseShape(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}


	@Override
	public double calculateArea() {
		return -1;
	}
}
