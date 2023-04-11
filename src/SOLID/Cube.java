package SOLID;

public class Cube implements Shape, ThreeDimentionalShape{

	@Override
	public double volumen() {
		return 1000;
	}

	@Override
	public double area() {
		return 300;
	}

}
