package com.cl.mammal;

public class Gorilla {
	// Member variable (attribute);
	public int energyLevel = 100;
	
	// Methods
	public int displayEnergy() {
		return energyLevel;
	}
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla threw something, energy decreased by 5.");
		System.out.println("Energy: " + energyLevel);
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Thr gorilla ate bananas, energy increased by 10.");
		System.out.println("Energy: " + energyLevel);
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("Chillin on top of a tree, energy decreased by 10.");
		System.out.println("Energy: " + energyLevel);
	}
}
