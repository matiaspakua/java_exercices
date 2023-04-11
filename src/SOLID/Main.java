package SOLID;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		AreaCalculator areaCalculator = new AreaCalculator();
		Circle circle = new Circle(3);
		Square square = new Square(2);

		List<Object> shapes = List.of(circle, square);

		int sum = areaCalculator.sum(shapes);

		System.out.println("Sum is: " + sum);
	}
}
