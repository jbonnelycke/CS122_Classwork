public class SortGrades {

// Creates an array of grades, sorts them, then prints them.

	public static void main(String[] args) {
		int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};
		
		// linear
		System.out.println(Searching.linearSearch(grades, 91));
		
		// sort them for binary search
		Sorts.insertionSort(grades);
		
		// check that the sort worked
		for (int index = 0; index < grades.length; index++)
			System.out.print (grades[index] + " ");
		
		// binary
		System.out.println();
		System.out.println(Searching.binarySearch(grades, 91));

	}
}
