package com.example.autowiring;

import java.awt.Shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class ShapeFactory {
	// autowiring by type

	@Autowired
	@Qualifier("rectangle") // shape = new Rectangle();
	private IShape shape;

	@Autowired
	private IShape triangle;

	// autowiring by constructor
	private IShape shaper;

	public ShapeFactory(IShape shaper) {
		super();
		this.shaper = shaper;
	}

//public void printArea(int x, int y) {
//	System.out.println("Printing area...");
//	shape.area(x, y);
//}

	public void printArea(String choice, int x, int y) {

		if (choice.equals("r")) {
			shape.area(x, y);
		}
		if (choice.equals("t")) {
			triangle.area(x, y);
		}
		if (choice.equals("s")) {
			shaper.area(x, y);
		}
	}

}
