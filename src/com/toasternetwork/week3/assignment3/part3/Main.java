package com.toasternetwork.week3.assignment3.part3;

public class Main {

	private static void fireWeapon(IWeapon weapon) {
		if(weapon instanceof Bomb)
			System.out.println("----------> I am a Bomb! BOOM!");
		weapon.activate(true);
		weapon.fireWeapon(5);
	}
	public static void main(String[] args) {
		IWeapon[] weapons = new IWeapon[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();

		for(IWeapon weapon : weapons) {
			fireWeapon(weapon);
		}
	}
}
