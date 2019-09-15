import java.util.Scanner;

public class Recursion {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sumv = sum(n);
		//System.out.println(sumv);
		/*int sum = 0;
		
		for (int i = n; i > 0; i--) {
			sum = sum+n;
			System.out.println(sum);
		}
		
		System.out.println(sum);*/
	}
	
	private static int sum(int n) {
		int x;
		
		System.out.println(n);
		if (n==1)
			x = 1;
		else
			x = n + sum(n-1);
		System.out.println(x);
		return x;
	}
}
