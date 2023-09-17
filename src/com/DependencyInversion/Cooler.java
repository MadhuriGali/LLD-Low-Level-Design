package com.DependencyInversion;

public class Cooler implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("switch on cooler");
		
	}

	@Override
	public void turnOff() {
		System.out.println("switch of cooler");
		
	}

}
