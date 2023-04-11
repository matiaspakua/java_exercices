package SOLID;

import java.util.NoSuchElementException;

public class NoShape implements Shape{

	@Override
	public double area() {
		throw new NoSuchElementException("No valid shape");
	}

}
