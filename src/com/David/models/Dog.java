package com.David.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
	public String showAffection() {
		String name = getName();
		return (name+" goes woof");
	}

}
