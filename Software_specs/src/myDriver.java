public class myDriver {

	public static void main(String[] args) {
		
		grandparent product1 = new concreteFactory();
	
		System.out.println(product1.method1());
		System.out.println(((concreteFactory)product1).method2());
		System.out.println(((concreteFactory)product1).method3());
		System.out.println(((concreteFactory)product1).method4());
		
	}

}
