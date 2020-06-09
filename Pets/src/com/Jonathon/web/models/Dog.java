package com.Jonathon.web.models;

public class Dog extends Animal implements Pet {
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	@Override
	public String showAffection(String breed, String name, int weight) {
		if ( weight > 40 ) {
			return "Your " + breed + " named " + name + " curled up next to you.";
		} else {
			return "Your " + breed + " named" + name + " hopped into bed and curled up next to you.";
		}
	}
}
