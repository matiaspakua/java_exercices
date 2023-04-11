package SOLID;

import java.util.List;

public class AreaCalculator {

	public int sum(List<Object> shapes) {

		int sum = 0;

		for (int i = 0; i < shapes.size(); i++) {
			Object shape = shapes.get(i);

			if (shape instanceof Square) {
				sum += Math.pow(((Square) shape).getLenght(), 2);
			}
			if (shape instanceof Circle) {
				sum += Math.PI * Math.pow(((Circle) shape).getRadious(), 2);
			}
		}
		return sum;
	}

}
