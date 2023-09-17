package com.DependencyInversion;

//It states that high-level modules (classes or components) should not depend on low-level modules.
//Instead, both should depend on abstractions

public class LightBulb {
	
	    void turnOn() {
	       System.out.println("turn on light");
	    }

	    void turnOff() {
	       System.out.println("turnoff light");
	    }
	}

	class Fan {
	    void turnOn() {
	        System.out.println("turn on fan");
	    }

	    void turnOff() {
	        System.out.println("turn off fan");
	    }
	}

	/*
	 * class Switch { private LightBulb bulb;
	 * 
	 * void connect(LightBulb bulb) { this.bulb = bulb; }
	 * 
	 * void turnOn() { bulb.turnOn(); }
	 * 
	 * void turnOff() { bulb.turnOff(); } }
	 */


