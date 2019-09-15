public class Sorts {
// Sorts the specified array of integers using the selection
// sort algorithm.
	public static void selectionSort(int[] numbers) {
		int min, temp;
		for (int index = 0; index < numbers.length - 1; index++) {
			min = index;

			for (int scan = index + 1; scan < numbers.length; scan++)
				if (numbers[scan] < numbers[min])
					min = scan;

			// Swap the values
			temp = numbers[min];
			numbers[min] = numbers[index];
			numbers[index] = temp;
		}
	}

	public static void insertionSort(int[] numbers) {
		System.out.println("insertion sort starting");

		for (int index = 1; index < numbers.length; index++) {
			int key = numbers[index];
			int position = index;

			// shift larger values to the right
			while (position > 0 && numbers[position - 1] > key) {
				numbers[position] = numbers[position - 1];
				position--;
			}
			numbers[position] = key;
		}
	}
}
