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

		Optionals.usingOrElse();

		Optionals.usingOrElseGet();

		Optionals.usingOrThrow();

		Optionals.chainingOptionalsExtended();
	}

	/**
	 * Here, we create an Optional object from a potentially null variable name. If
	 * name is null, optionalName is empty, and defaultName is set to "John Doe".
	 * This avoids a NullPointerException if we were to directly use name.
	 */
	private static void avoidNullPointersExceptions() {
		String name = null;

		Optional<String> optionalName = Optional.ofNullable(name);

		String defaultName = optionalName.orElse("Defaul Name if Null!!");

		System.out.println(defaultName);

	}

	/**
	 * Here, we have an Optional object employee that represents an employee. We
	 * want to get the name of the company the employee works for. We first use the
	 * map method to extract the company object from the Employee object, which may
	 * be null. We then use flatMap to convert the resulting Optional<Company>
	 * object to an Optional<String> object that contains the name of the company,
	 * or is empty if the company is null.
	 */
	private static void chainingOptionals() {
		Employee employee = new Employee();

		Optional<String> company = Optional.ofNullable(employee).map(Employee::getCompany)
				.flatMap(Optional::ofNullable);

		System.out.println(company);

	}

	/**
	 * Here, we have a list of names that includes a null value. We want to count
	 * the number of non-null names using a Stream. We first use the filter method
	 * to remove the null value by checking that each element is not empty using
	 * Optional::ofNullable. We then count the number of remaining elements using
	 * count().
	 */
	private static void optionalsWithStreams() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", null, "Mike");

		long count = names.stream()
				// .filter(Optional.ofNullable)
				.count();

		System.out.println(count);
	}

	/**
	 * Using the orElse method: The orElse method returns the value of the Optional
	 * object if it is not null, and returns a default value if the Optional object
	 * is null. For example:
	 */
	private static void usingOrElse() {
		Person person = new Person();
		String name = Optional.ofNullable(person).map(Person::getName).orElse("Unknown");

		System.out.println(name);
	}

	/**
	 * Using the orElseGet method: The orElseGet method is similar to orElse, but it
	 * takes a Supplier as an argument, which is called only when the Optional
	 * object is null. For example:
	 */
	private static void usingOrElseGet() {
		Person person = new Person();

		String name = Optional.ofNullable(person).map(Person::getName).orElseGet(() -> getNameFromDatabase());

		System.out.println(name);
	}

	private static String getNameFromDatabase() {

		return "Name From Database retrieved: Jorge";
	}

	/**
	 * Using the orElseThrow method: The orElseThrow method returns the value of the
	 * Optional object if it is not null, and throws an exception if the Optional
	 * object is null. For example:
	 */
	private static void usingOrThrow() {
		Person person = new Person();

		String name = Optional.ofNullable(person).map(Person::getName)
				.orElseThrow(() -> new IllegalArgumentException("Person name cannot be null"));

		System.out.println(name);
	}

	private static void chainingOptionalsExtended() {
		Person person = new Person();

		Optional<String> name = Optional.ofNullable(person).map(Person::getAddress)
				// .map(Address::getCity)
				.filter(city -> !city.isEmpty());

		System.out.println(name.get());

	}

}
