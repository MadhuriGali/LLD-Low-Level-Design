package com.DependencyInversion;

public class Light implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("turn on light");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off light");
		
	}

}
