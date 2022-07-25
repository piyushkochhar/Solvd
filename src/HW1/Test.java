package HW1;

public class Test {

	public static void main(String[] args) {

		Integer[] numbers = { 6, 5, 1, 2, 3, 4, 3 };
		String[] words = { "zebra", "cat", "bat", "racoon", "cat" };
		Character[] alphabets = { 'Z', 'C', 'B', 'R', 'C' };

		// Create InsertionSort class Object
		InsertionSort inSort = new InsertionSort();

		// Create SelectionSort class Object
		SelectionSort seSort = new SelectionSort();

		// Insertion sort with Numbers
		inSort.sortByAscendingOrder(numbers);
		inSort.sortByDescendingOrder(numbers);

		// Insertion sort with Strings
		inSort.sortByAscendingOrder(words);
		inSort.sortByDescendingOrder(words);

		// Insertion sort with Characters
		inSort.sortByAscendingOrder(alphabets);
		inSort.sortByDescendingOrder(alphabets);

		// Selection sort with Numbers
		seSort.sortByAscendingOrder(numbers);
		seSort.sortByDescendingOrder(numbers);

		// Selection sort with Strings
		seSort.sortByAscendingOrder(words);
		seSort.sortByDescendingOrder(words);

		// Selection sort with Characters
		seSort.sortByAscendingOrder(alphabets);
		seSort.sortByDescendingOrder(alphabets);

	}

}
