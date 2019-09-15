public class SumRecursive {
	public static void main(String[] args) {

		int num = 10;
		System.out.println("The sum of all integers from 1 to " + num + " is " + sum(num));
		
	}

	// This method returns the sum of 1 to n
	public static int sum(int n) {
		int result;
		System.out.println("sum(" + n + ")");

		if (n == 1) // base case
			result = 1;
		else
			result = n + sum(n - 1); // recursive call
		System.out.println("result = " + result);
		return result;
	}

}
