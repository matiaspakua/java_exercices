package SOLID;

public class Square implements Shape {

	private int side = 0;

	public Square(int side) {
		this.side = side;
	}

	public double getLenght() {
		return this.side;
	}

	@Override
	public double area() {
		return Math.pow(getLenght(), 2);
	}

}
