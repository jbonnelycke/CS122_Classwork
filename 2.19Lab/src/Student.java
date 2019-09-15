
public class Student extends Person {
	
	String firstName;
	String lastName;
	int id;
	int[] testScores;
		
	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}
	
	public char calculate() {
		int sum = 0;
		int count = 0;
		for (int i=0; i < testScores.length; i++) {
			sum += testScores[i];
			count++;
		}
		int average = sum / count;
		if (average >= 90) 
			return 'O';
		else if (average >= 80)
			return 'A';
		else if (average >= 70)
			return 'B';
		else if ((average > 40) && (average <= 55))
			return 'C';
		else
			return 'D';
			
	}
}
