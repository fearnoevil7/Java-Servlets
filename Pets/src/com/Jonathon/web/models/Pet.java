package com.Jonathon.web.models;

public interface Pet {
	public default String showAffection(String breed, String name, int weight) {
		return "Your pet " + breed + " " + name + " is looking at you with some affection, You think.";
	}
}
