package com.design.patterns.factory;

import com.design.patterns.factory.shapes.Circle;
import com.design.patterns.factory.shapes.Rectangle;
import com.design.patterns.factory.shapes.Shape;
import com.design.patterns.factory.shapes.Square;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}