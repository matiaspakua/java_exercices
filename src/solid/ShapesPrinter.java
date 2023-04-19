package solid;

import java.util.List;

public class ShapesPrinter {

	private IAreaCalculator areaCalculator;
	
	public ShapesPrinter(IAreaCalculator areaCalculator) {
		super();
		this.areaCalculator = areaCalculator;
	}

	public String json(List<Shape> shapes) {
		int sum = this.areaCalculator.sum(shapes);
		return "{sum: %s}".formatted(sum);
	}

	public String cvs(List<Shape> shapes) {
		int sum = this.areaCalculator.sum(shapes);
		return "sum, %s".formatted(sum);
	}

}