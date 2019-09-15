import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Get the numbers, convert to String array, then convert to Int array
		String nums = scnr.nextLine();
		String[] arrStr = nums.split(", ");
		int[] arrInt = new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}

		// the sort
		insertionSort(arrInt);

		// print out as proof
		for (int i = 0; i < arrInt.length; i++) {
			if (i == (arrInt.length - 1))
				System.out.print(arrInt[i]);
			else
				System.out.print(arrInt[i] + " ");
		}

	}

	public static void insertionSort(int[] numbers) {
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
