package com.toasternetwork.week3.assignment3.part2;

public class Main {

	private static void displayArea(BaseShape shape) {
		System.out.printf("%s has an area of %.2f\n", shape.getName(), shape.calculateArea());
	}

	public static void main(String[] args) {
		BaseShape[] shapes = new BaseShape[3];
		shapes[0] = new Rectangle("Rectangle", 300,200);
		shapes[1] = new Triangle("Triangle", 300,300);
		shapes[2] = new Circle("Circle", 300,300);
		for (BaseShape shape : shapes) {
			displayArea(shape);
		}
	}
}
