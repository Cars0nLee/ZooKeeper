package com.cl.mammal;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	// Methods
	public void fly() {
		energyLevel -= 50;
		System.out.println("Flying bat.");
		System.out.println("Energy: " + displayEnergy());
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Bat just ate a human. Yum.");
		System.out.println("Energy: " + displayEnergy());
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Town is on fire.");
		System.out.println("Energy: " + displayEnergy());
	}
}

