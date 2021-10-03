package com.toasternetwork.week3.assignment3.part3;

public class Gun implements IWeapon {
	public void fireWeapon() {
		System.out.println("In Gun.fireWeapon()");
	}

	public void fireWeapon(int power) {
		System.out.printf("In Gun.fireWeapon() with a power of %d\n", power);
	}

	public void activate(boolean enable) {
		System.out.printf("Gun.activate? %s\n", enable ? "Yes" : "No");
	}
}
