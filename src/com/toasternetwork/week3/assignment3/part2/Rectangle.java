package com.toasternetwork.week3.assignment3.part2;

public class Rectangle extends BaseShape {
	public Rectangle(String name, int width, int height) {
		super(name, width, height);
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
}
