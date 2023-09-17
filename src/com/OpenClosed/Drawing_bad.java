package com.OpenClosed;

//It states that software entities (such as classes, modules, and functions) should be open for extension
//but closed for modification.
public class Drawing_bad {
	public void circle() {
//draw circle
	}

	public void square() {
//draw square
	}
}
// these code is violating open closed principle
//because if we want to draw triangle you have to modify the code which is not allowed.