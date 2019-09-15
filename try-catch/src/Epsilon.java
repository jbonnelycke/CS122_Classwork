import java.util.*;

public class Epsilon extends Delta{
	//try-catch the InputMismatchException here
	public static void EpsilonMethod() {
		System.out.println("EpsilonMethodCalled");
		
		try {
			Zeta.ZetaMethod();
		} catch (InputMismatchException e) {
			System.out.println("Epsilon caught");
		}
	}
}
