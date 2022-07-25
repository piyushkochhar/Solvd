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
		// step 1: loop from the beginning of the inputArray to the second to last item
		for (int currentIndex = 0; currentIndex < inputArray.length - 1; currentIndex++) {
			// step 2: save a copy of the currentIndex
			int minIndex = currentIndex;
			// step 3: loop through all indexes that proceed the currentIndex
			for (int i = currentIndex + 1; i < inputArray.length; i++) {
				// step 4: if the value of the index of the current loop is less
				// than the value of the item at minIndex, update minIndex
				// with the new lowest value index
				if (inputArray[i].compareTo(inputArray[minIndex]) < 0) {
					// update minIndex with the new lowest value index
					minIndex = i;
				}
			}
			// step 5: if minIndex has been updated, swap the values at minIndex and
			// currentIndex
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
		// step 1: loop from the beginning of the inputArray to the second to last value
		for (int currentIndex = 0; currentIndex < inputArray.length - 1; currentIndex++) {
			// step 2: save a copy of the currentIndex
			int minIndex = currentIndex;
			// step 3: loop through all indexes that proceed the currentIndex
			for (int i = currentIndex + 1; i < inputArray.length; i++) {
				// step 4: if the value of the index of the current loop is more
				// than the value of the item at minIndex, update minIndex
				// with the new highest value index
				if (inputArray[i].compareTo(inputArray[minIndex]) > 0) {
					// update minIndex with the new highest value index
					minIndex = i;
				}
			}
			// step 5: if minIndex has been updated, swap the values at minIndex and
			// currentIndex
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
