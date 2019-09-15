
public class Driver {

	public static void main(String[] args) {
		
		Parent myObject = new Child();
		
		System.out.println(myObject); // See that the output of this is a hash
		
		String mySt = new String();
		
		mySt = "testing";
		
		System.out.println(mySt); // This works because the String class is already
								    // defined by Java, so there's a toString
		
		//System.out.println(Child.x); // Security issue here when x is private
								       // because you get "x is not visible"
									   // when you should get "x is not resolved"
		
		System.out.println(((Child) myObject).ch_method());
	}
	
}
