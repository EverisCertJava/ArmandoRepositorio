package mx.com.everis.tallerjava.claseshijas;

import mx.com.everis.tallerjava.inter.Shape;

public class Circle implements Shape{
	
	public Circle(){
		System.out.println("Circle");
		//draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

}
