
public class Child extends Parent {
	private int x = 7; // even if you "extend" local should override
	
	public int ch_method() {
		int x = 8;
		return super.x; // super keyword ignores local and instance variables. uses
						// parent class variables. *can only be used if class that 
						// has the keyword is extending a parent class
	}
}
