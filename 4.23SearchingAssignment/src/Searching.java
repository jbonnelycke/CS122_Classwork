
public class Searching {
	public static int linearSearch(int[] list, int target) {
		int index = 0;
		boolean found = false;

		while (!found && index < list.length) {
			if (list[index] == (target))
				found = true;
			else
				index++;
		}

		if (found)
			return list[index];
		else
			return -1;
	}

	public static int binarySearch(int[] list, int target) {
		int min = 0, max = list.length - 1, mid = 0;
		boolean found = false;

		while (!found && min <= max) {
			mid = (min + max) / 2;
			if (list[mid] == (target))
				found = true;
			else if (list[mid] < target)
				min = mid + 1;
			else
				max = mid - 1;
		}

		if (found)
			return list[mid];
		else
			return -1;
	}
}
