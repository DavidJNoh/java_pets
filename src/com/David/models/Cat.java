package com.David.models;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		String name = getName();
		return (name+" goes meow");
	}

}
