package mx.com.everis.tallerjava.claseshijas;

import mx.com.everis.tallerjava.inter.Shape;

public class Square implements Shape{
	
	public Square(){
		System.out.println("Square");
		//draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Draw Square");
	}

}
