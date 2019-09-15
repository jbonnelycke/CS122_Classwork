
public class Person {
	private int age;
	
	public Person(int initialAge) {
		if (initialAge >= 0)
			this.age = initialAge;
		else
			age = 0;
	}
	
	public void yearPasses() {
		age++;
	}
	
	public String amIOld() {
		if (age < 13)
			return "You are young.";
		else if (age < 18)
			return "You are a teenager.";
		else
			return "You are old.";
	}
}
