package general.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		StreamAPI.filter();
		StreamAPI.mapping();
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
}
