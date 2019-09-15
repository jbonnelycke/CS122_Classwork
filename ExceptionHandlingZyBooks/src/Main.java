import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int[] a = new int[20];
		String s;
		int x = 0;
		try {
			s = scnr.next();
			x = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.print("Enter a number");
		}
		if (x < 0) {
			throw new ArithmeticException("Enter a positive number");
		}
		else {
			for (int i = 0; i < x; i++)
				a[i] = i;
		}
	}
}
