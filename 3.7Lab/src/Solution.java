
class Solution {
	public static void main(String[] args) {
		A objectOfA = new B();
		System.out.println(objectOfA.add(2)); // get 3 b/c it's a B object type
		System.out.println(objectOfA.a); // get 10 b/c it's always the superclass' variable
		
	}
}
