package general.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambda expressions: a concise way to define anonymous functions and pass them around as data.
 * @author matias miguez
 *
 */
public class Lambdas {
	public static void main(String[] args) {
		
		Lambdas.sortingLists();
		
		Lambdas.filteringLists();
		
		Lambdas.mappingList();
		
		Lambdas.usingRunnables();
		
	}

	public static void sortingLists() {
		System.out.println("\nSorting Lists");
		List<String> names = Arrays.asList("John", "Steve", "Mary", "Bob");
		System.out.println(names);		
		
		Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));
		System.out.println(names);
	
	}
	
	
	public static void filteringLists() {
		System.out.println("\nFilter Lists \n");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(numbers);
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

	}
	
	public static void mappingList() {
		System.out.println("\nMapping Lists \n");
		List<String> names = Arrays.asList("John", "Steve", "Mary", "Bob");
		System.out.println(names);
		
		List<Integer> nameLengths = names.stream().map(name -> name.length()).collect(Collectors.toList());
		System.out.println(nameLengths);		
	}
	
	public static void usingRunnables() {
		System.out.println("\nUsing Runnables \n");
		Runnable r = () -> System.out.println("Hello World!");
		new Thread(r).start();
	}
}
