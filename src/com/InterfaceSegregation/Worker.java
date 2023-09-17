package com.InterfaceSegregation;

/*It states that a class should not be forced to implement interfaces it does not use. In other words, 
 * 
it suggests that you should have specific, focused interfaces rather than large, monolithic ones, 

and classes should only implement the interfaces that are relevant to their functionality.*/
public interface Worker {
	public void cook();

	public void code();

	public void sleep();

}
//these interface is violating  interface segregation principle
//chef want to use only cook and sleep method
//programmer want to override code and sleep method.

interface cookable{
    void cook();
}

interface proframmable {
    void code();
}

interface Sleepable {
    void sleep();
}
