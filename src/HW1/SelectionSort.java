package HW1;

public class SelectionSort<T extends Comparable<? super T>> {

	private String msg;

	protected void printResult(T[] inputinputArray, String msg) {
		System.out.print(msg + " : ");
		for (int i = 0; i < inputinputArray.length; i++) {
			System.out.print(inputinputArray[i] + " ");
		}
		System.out.println("\n--------------------------------------------------");
	};

	protected void sortByAscendingOrder(T[] inputArray) {
		for (int currentIndex = 0; currentIndex < inputArray.length - 1; currentIndex++) {
			int minIndex = currentIndex;
			for (int i = currentIndex + 1; i < inputArray.length; i++) {
				/**
				 * Check:
				 * 	If the value of the index of the current loop is less
				 * than the value of the item at minIndex, update minIndex
				 * with the new lowest value index
				 */
				if (inputArray[i].compareTo(inputArray[minIndex]) < 0) {
					minIndex = i;
				}
			}
			if (minIndex != currentIndex) {
				T temp = inputArray[currentIndex];
				inputArray[currentIndex] = inputArray[minIndex];
				inputArray[minIndex] = temp;
			}
		}

		msg = "Ascending Selection Sort";

		printResult(inputArray, msg);

	}

	protected void sortByDescendingOrder(T[] inputArray) {
		for (int currentIndex = 0; currentIndex < inputArray.length - 1; currentIndex++) {
			int minIndex = currentIndex;
			for (int i = currentIndex + 1; i < inputArray.length; i++) {
				/**
				 * Check:
				 * 	If the value of the index of the current loop is more
				 * than the value of the item at minIndex, update minIndex
				 * with the new lowest value index
				 */
				if (inputArray[i].compareTo(inputArray[minIndex]) > 0) {
					minIndex = i;
				}
			}
			if (minIndex != currentIndex) {
				T temp = inputArray[currentIndex];
				inputArray[currentIndex] = inputArray[minIndex];
				inputArray[minIndex] = temp;
			}
		}

		msg = "Descending Selection Sort";

		printResult(inputArray, msg);

	}

}
