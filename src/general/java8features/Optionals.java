package general.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Optional class: a way to handle null values in a more elegant and safe way.
 * 
 * @author matias miguez
 *
 */
public class Optionals {
	public static void main(String[] args) {
		Optionals.avoidNullPointersExceptions();

		Optionals.chainingOptionals();

		Optionals.optionalsWithStreams();
	}

	private static void avoidNullPointersExceptions() {
		String name = null;

		Optional<String> optionalName = Optional.ofNullable(name);

		String defaultName = optionalName.orElse("Defaul Name if Null!!");

		System.out.println(defaultName);

	}

	private static void chainingOptionals() {
		Employee employee = new Employee();

		Optional<String> company = Optional.ofNullable(employee).map(Employee::getCompany)
				.flatMap(Optional::ofNullable);

		System.out.println(company);

	}

	private static void optionalsWithStreams() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", null, "Mike");
		
		long count = names.stream()
				//.filter(Optional.ofNullable)
				.count();
		
		System.out.println(count);
		
		

	}
}
