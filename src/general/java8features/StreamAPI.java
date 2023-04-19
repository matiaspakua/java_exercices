package general.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Stream API: a set of functional interfaces and methods to perform operations on a 
 * collection of elements in a more concise and declarative way.
 * 
 * @author matias miguez
 */
public class StreamAPI {
	public static void main(String[] args) {

		StreamAPI.filter();
		
		StreamAPI.mapping();
		
		StreamAPI.reduce();
		
		StreamAPI.collect();
		
		StreamAPI.parallezizableCollect();
	}


	public static void filter() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Alice");
		System.out.println(names);

		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		filteredNames.forEach(System.out::println);
	}

	
	public static void mapping() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Alice");
		
		List<Integer> nameLengths = names.stream()
				.map(String::length)
				.collect(Collectors.toList());
	
		nameLengths.forEach(System.out::println);
	}
	
	private static void reduce() {		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> sum = numbers.stream()
				.reduce(Integer::sum);
		
		System.out.println(sum.get());
		
	}
	
	private static void collect() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Alice");
		
		Set<String> nameSet = names.stream()
				.collect(Collectors.toSet());
		
		nameSet.forEach(System.out::println);		
	}
	
	/**
	 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html#MutableReduction
	 */
	private static void parallezizableCollect() {
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Alice");
		
		ArrayList<String> namesAppended = names.stream()
				.collect(() -> new ArrayList<>(),
						(c, e) -> c.add(e.toString()),
						(c1, c2) -> c1.addAll(c2));
		
		//namesAppended.forEach(System.out::println);
		System.out.println(namesAppended);
		
	}
}






