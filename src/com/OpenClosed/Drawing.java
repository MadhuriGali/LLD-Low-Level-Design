package com.OpenClosed;
class Drawing{
	
	public static void main(String[] args) {
		Drawing d=new Drawing();
		Shape circle=new Circle();
		d.drawShape(circle);
	}
	void drawShape(Shape shape) {
		shape.draw();
		
	}
}