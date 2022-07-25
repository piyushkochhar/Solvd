package HW1;

public class InsertionSort<T extends Comparable<? super T>> {

	private String msg;

	protected void printResult(T[] inputArray, String msg) {
		System.out.print(msg + " : ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println("\n--------------------------------------------------");
	};

	protected void sortByAscendingOrder(T[] inputArray) {

		// start at the first index and iterate through to the end
		for (int i = 1; i < inputArray.length; i++) {
			int currentIndex = i;

			/*
			 * Check: 
			 * 1. that currentIndex is at least 1 
			 * 2. that the value before the currentIndex is smaller than the value at currentIndex
			 *
			 * If both conditions are met, swap the indexes
			 */
			while (currentIndex > 0 && (inputArray[currentIndex - 1]).compareTo(inputArray[currentIndex]) > 0) {
				T temp = inputArray[currentIndex];
				inputArray[currentIndex] = inputArray[currentIndex - 1];
				inputArray[currentIndex - 1] = temp;
				currentIndex--;
			}
		}

		msg = "Ascending Insertion Sort";

		printResult(inputArray, msg);
	}

	protected void sortByDescendingOrder(T[] inputArray) {

		// start at the first index and iterate through to the end
		for (int i = 1; i < inputArray.length; i++) {
			int currentIndex = i;

			/*
			 * Check: 
			 * 1. that currentIndex is at least 1 
			 * 2. that the value before the currentIndex is greater than the value at currentIndex
			 *
			 * If both conditions are met, swap the indexes
			 */
			while (currentIndex > 0 && (inputArray[currentIndex - 1]).compareTo(inputArray[currentIndex]) < 0) {
				T temp = inputArray[currentIndex];
				inputArray[currentIndex] = inputArray[currentIndex - 1];
				inputArray[currentIndex - 1] = temp;
				currentIndex--;
			}
		}

		msg = "Descending Insertion Sort";

		printResult(inputArray, msg);
	}

}
