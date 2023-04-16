package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class CommonMistakes {

	public static void main(String[] args) {

		CommonMistakes.concurrentModificationError();

	}

	public static void concurrentModificationError() {

		ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("one", "two", "three"));

		/*
		 * .. lots of code
		 */

		// This action thrown a ConcurrentModificationException

		/*
		listOfWords.forEach(word -> {
			if (word.equals("two")) {
				listOfWords.remove(word);
			}
		});
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

}
