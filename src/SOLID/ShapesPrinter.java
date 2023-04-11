package SOLID;

public class ShapesPrinter {

	public ShapesPrinter() {
		super();
	}

	public String json(int sum) {
		return "{sum: %s}".formatted(sum);
	}

	public String cvs(int sum) {
		return "sum, %s".formatted(sum);
	}

}