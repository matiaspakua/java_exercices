package SOLID;

public class Circle implements Shape {

	private int radious = 0;

	public Circle(int radious) {
		this.radious = radious;
	}

	public double getRadious() {

		return this.radious;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadious(), 2);
	}

}
