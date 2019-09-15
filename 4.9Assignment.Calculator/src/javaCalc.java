import java.util.*;
import java.io.*;

public class javaCalc {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		int answer = 0;
		
		// For making the file
		String fileName = "file.txt";
		PrintWriter outFile = new PrintWriter(fileName);
		
		do {
			try {
				// Gets first integer
				System.out.print("Enter the first operand: ");
				int number1 = input.nextInt();

				// Gets second integer
				System.out.print("Enter the second operand: ");
				int number2 = input.nextInt();
				
				// User chooses what operand
				System.out.print("Desired operation: + - * /  ");
				String operation = input.next();
				
				// Program determines what operand was chosen
				if (operation.equals("+"))
					answer = number1 + number2;
				else if (operation.equals("-"))
					answer = number1 - number2;
				else if (operation.equals("*"))
					answer = number1 * number2;
				else if (operation.equals("/"))
					answer = number1 / number2;
				else
					System.out.println("huh?");
				
				// Output answer
				System.out.println(number1 + " " + operation + " " + number2 + " = "
						+ answer);
				
				// Prints the output to a file
				outFile.println(answer);
				System.out.println("Answer also written to a file: " + fileName);
				
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a number is required)");
				input.nextLine(); // discard input
			} catch (ArithmeticException ex) {
				System.out.println("Try again. (Division by zero attempted)");
				input.nextLine();
			}
		} while (continueInput);
		
		// Completes the file so that the output is actually printed
		outFile.close();
		
	}
}
