package mx.com.everis.tallerjava.claseshijas;

import mx.com.everis.tallerjava.inter.Shape;

public class Rectangle implements Shape{
	
	public Rectangle(){
		System.out.println("Rectangle");
		//draw();
	}

	@Override
	public void draw() {
		System.err.println("Draw rectangle");
	}

}
