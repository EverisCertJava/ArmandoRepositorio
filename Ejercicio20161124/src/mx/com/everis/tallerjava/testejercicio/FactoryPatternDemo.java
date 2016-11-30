package mx.com.everis.tallerjava.testejercicio;

import mx.com.everis.tallerjava.claseshijas.ShapeFactory;
import mx.com.everis.tallerjava.inter.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		Shape square = shapeFactory.getShape("SQUARE");

		/*circle.draw();
		square.draw();
		rectangle.draw();*/
	}

}
