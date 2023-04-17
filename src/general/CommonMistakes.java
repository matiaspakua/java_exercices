package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author matias on AmigosCode youtube video:
 *         https://www.youtube.com/watch?v=rjDUpxtUPAE
 *
 */
public class CommonMistakes {

	public static void main(String[] args) {

		CommonMistakes.concurrentModificationError();

		CommonMistakes.genericsMixingDataTypes();

		CommonMistakes.compareStringWithEquals();

	}

	public static void concurrentModificationError() {

		System.out.println("*** MISTAKE #01: concurrentModificationException ***");
		ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("one", "two", "three"));

		/*
		 * .. lots of code
		 */

		// This action thrown a ConcurrentModificationException

		/*
		 * listOfWords.forEach(word -> { if (word.equals("two")) {
		 * listOfWords.remove(word); } });
		 */

		/*
		 * A ConcurrentModificationException is thrown in Java when an object is
		 * structurally modified while being iterated over. In the case of an ArrayList,
		 * if an element is removed from the list while an iteration over the list is in
		 * progress using the iterator or listIterator, the
		 * ConcurrentModificationException will be thrown.
		 * 
		 * This happens because the iterator keeps a count of the number of elements in
		 * the list at the time it was created. When you modify the list by adding or
		 * removing elements during the iteration, the count of elements changes, and
		 * the iterator becomes invalid. This can cause the iterator to fail when it
		 * tries to access elements that no longer exist, or when it detects that the
		 * structure of the list has changed.
		 * 
		 * To avoid this exception, you can either use an iterator to remove elements,
		 * or you can use a traditional for loop that does not rely on the iterator. For
		 * example, you can use the removeIf method of ArrayList to remove elements that
		 * meet a certain condition without using an iterator. Additionally, you can use
		 * a copy of the original list to modify the list while iterating over it
		 * without getting a ConcurrentModificationException.
		 * 
		 */

		System.out.println("Before: " + listOfWords);
		Iterator<String> iterator = listOfWords.iterator();

		while (iterator.hasNext()) {
			String word = iterator.next();

			if (word.equals("two")) {
				listOfWords.remove(word);
			}
		}
		System.out.println("After: " + listOfWords);

	}

	public static void genericsMixingDataTypes() {

		System.out.println("*** MISTAKE #02: Using Data Type and Generics ***");
		/*
		 * Here we are using a specific type of collection: ArrayList without specifying
		 * the collection type and then we iterate over the collection and perform
		 * operation over the elements. This code thown a ClassCastException.
		 */

		/**********
		 * Wrong code
		 * 
		 * ArrayList genericList = new ArrayList<>();
		 * 
		 * genericList.add(10); genericList.add("20");
		 * 
		 * genericList.forEach(value -> System.out.println((int)value * 2));
		 */

		/*
		 * To fix the code: 1. Use Generic: List instead of ArrayList and with TYPE. 2.
		 * Remove the CAST
		 */

		List<Integer> genericListOfIntegers = new ArrayList<>();
		genericListOfIntegers.add(10);
		// genericListOfIntegers.add("20"); // is mark as an error.
		genericListOfIntegers.add(20);

		// also we can remove the CAST (int)value * 2
		genericListOfIntegers.forEach(value -> System.out.println(value * 2));

		/*
		 * When declaring a variable, it is often good practice to use the interface
		 * type (such as List) rather than a specific implementation type (such as
		 * ArrayList) to increase flexibility and maintainability of the code.
		 * 
		 * Using the interface type allows you to switch to a different implementation
		 * type (such as LinkedList) without affecting the rest of the code, which can
		 * be helpful if you need to optimize performance or change requirements. It
		 * also makes the code more modular and easier to maintain, since the code that
		 * interacts with the list does not need to know about the specific
		 * implementation details.
		 * 
		 * Additionally, using the interface type promotes a programming paradigm known
		 * as "programming to the interface", which is a best practice in software
		 * development. It encourages you to write code that is focused on the behavior
		 * of the object rather than its implementation, which can lead to more flexible
		 * and maintainable code.
		 */
	}

	public static void compareStringWithEquals() {

		System.out.println("*** MISTAKE #03: Using == and .equals() ***");
		String oneString = "OneString";
		String secondString = "OneString";
		String thirdString = new String("OneString");

		if (oneString == secondString) {
			System.out.println("Comparing using == ");
		}

		if (oneString == thirdString) {
			System.out.println("Comparing using == ");
		} else {
			System.out.println("Memory directions are diferents of: " + oneString + " and " + thirdString);
		}

		if (oneString.equals(thirdString)) {
			System.out.println("Proper use of EQUALS() to compare Strings");
		}

	}

}
