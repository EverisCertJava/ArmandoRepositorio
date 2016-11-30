package mx.com.everis.tallerjava.claseshijas;

import mx.com.everis.tallerjava.inter.Shape;

public class ShapeFactory {
	public Shape getShape(String Forma){
		if (Forma.equalsIgnoreCase("Circle")) {
			/*Circle c = new Circle();
			c.draw();
			return c;*/
			return new Circle();
		} else if (Forma.equalsIgnoreCase("Rectangle")) {
			/*Rectangle r = new Rectangle();
			r.draw();
			return r;*/
			return new Rectangle();

		} else if (Forma.equalsIgnoreCase("Square")) {
			/*Square s = new Square();
			s.draw();
			return s;*/
			return new Square();
		}
		else{
			return null;
		}
	}
}
