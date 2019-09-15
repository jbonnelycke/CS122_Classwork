import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		
		Person p1 = new Person(age);
		
		System.out.println(p1.amIOld());
		
		for (int j = 0; j < 3; j++) {
            p1.yearPasses();
		}
		
		System.out.println(p1.amIOld());
	}
}
