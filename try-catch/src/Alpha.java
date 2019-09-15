import java.util.Scanner;
public class Alpha {
	static protected Scanner myObj=new Scanner(System.in);
	protected static int numerator =0;
	protected static int denominator =0;
	protected static int division =0;
	
	public static void AlphaMethod() {
		System.out.println("AlphaMethodCalled");
		Beta.BetaMethod();
		
		if(division!=0) {
		System.out.println(numerator+"/"+denominator+"="+division);
		}
		if(division==0) {
		System.out.println("Exception occurred, division precluded.");
		}
	}
}
