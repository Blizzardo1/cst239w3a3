package com.toasternetwork.week3.assignment3.part2;

public class Circle extends BaseShape {
	public Circle(String name, int width, int height) {
		super(name, width, height);
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(width * height, 2);
	}
}
