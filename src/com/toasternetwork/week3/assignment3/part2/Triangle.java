package com.toasternetwork.week3.assignment3.part2;

public class Triangle extends BaseShape {
	public Triangle(String name, int width, int height) {
		super(name, width, height);
	}

	@Override
	public double calculateArea() {
		//noinspection IntegerDivisionInFloatingPointContext
		return (width * height) / 2;
	}
}
