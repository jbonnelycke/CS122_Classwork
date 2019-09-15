
public class Beta extends Alpha {
	// try-catch the ArithmeticException here
	public static void BetaMethod() {
		System.out.println("BetaMethodCalled");

		try {
			Gamma.GammaMethod();
		} catch (ArithmeticException e) {
			System.out.println("Beta caught");
		}
	}
}
