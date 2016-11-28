package mx.com.everis.tallerjava.testejercicio;

import mx.com.everis.tallerjava.fabrica.ShapeFactory;
import mx.com.everis.tallerjava.inter.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape("Circle");
		Shape square = shapeFactory.getShape("Square");
		Shape rectangle = shapeFactory.getShape("Rectangle");

		circle.draw();
		square.draw();
		rectangle.draw();
	}

}
