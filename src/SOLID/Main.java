package SOLID;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		IAreaCalculator areaCalculator = new AreaCalculator();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		
		// O: implementing the interface "shape" we made the area calculator open to extension and close for modification.
		Triangle triangle = new Triangle();
		
		// L: this element breaks the Liskov Substitution principle.
		//NoShape noShape = new NoShape();

		// I: interface segregation
		
		Cube cube = new Cube();
		
		List<Shape> shapes = List.of(circle, square, triangle, cube);

		int sum = areaCalculator.sum(shapes);

		// I
		System.out.println("Cube volumen: " + cube.volumen());
		
		System.out.println("Sum is: " + sum);
		
		// S: implementing and extracting the methods that print into a new class with a well define
		// responsibility, we implement the Single Responsibility principle.
		// D: Dependency Inversion
		ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
		System.out.println(shapesPrinter.json(shapes));
		System.out.println(shapesPrinter.cvs(shapes));
	}
}
