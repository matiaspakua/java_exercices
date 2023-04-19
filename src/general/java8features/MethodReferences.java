package general.java8features;

import java.util.Arrays;
import java.util.List;

/**
 * Method references: a way to reference an existing method as a value that can
 * be passed around.
 * 
 * @author matias miguez
 *
 */
public class MethodReferences {
	public static void main(String[] args) {

		MethodReferences.methodReferencePrintln();

		MethodReferences.sortIntegersMethodReference();
	}

	public static void methodReferencePrintln() {
		System.out.println("\n Method Reference PrintLn");
		List<String> names = Arrays.asList("John", "Mary", "Bob", "Alice");

		// Using a lambda expression
		names.forEach((name) -> System.out.println(name));

		// Using a method reference
		names.forEach(System.out::println);
	}

	public static void sortIntegersMethodReference() {
		System.out.println("\n Method Reference sort integer list.");
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		System.out.println(numbers);

		// using the compareTo method of the Integer class wrapper.
		numbers.sort(Integer::compareTo);

		System.out.println(numbers);
	}
}