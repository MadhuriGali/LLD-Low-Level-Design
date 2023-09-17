package com.DependencyInversion;
class Switch {
	
	private static Switchable swi;
	public static void main(String[] args) {	
		
		Switchable ob=new Cooler();
		Switch s=new Switch(ob);
		s.connect(swi);
		s.turnOn();
	}
	void connect(Switchable swi) {
        this.swi = swi;
    }
	    void turnOn() {
	        swi.turnOn();
	    }

	    void turnOff() {
	        swi.turnOff();
	    }
	    public Switch(Switchable ob) {
	        this.swi = ob;
	        
	    }
	}