package com.toasternetwork.week3.assignment3.part3;

public class Bomb implements IWeapon {
	public void fireWeapon() {
		System.out.println("In Bomb.fireWeapon()");
	}

	public void fireWeapon(int power) {
		System.out.printf("In Bomb.fireWeapon() with a power of %d\n", power);
	}

	public void activate(boolean enable) {
		System.out.printf("Bomb.activate? %s\n", enable ? "Yes" : "No");
	}
}
