//Generic Linked List driver for "longhand, non generic, Linked List"
public class LinkedListDriver {
	public static void main(String[] args) {
		LinkedListADT magazineRack = new LinkedListADT();

		System.out.println("The magazine list is as follows:");
		magazineRack.add(new Instance("Time"));
		magazineRack.add(new Instance("Woodworking Today"));
		magazineRack.add(new Instance("Communications of the ACM"));
		magazineRack.add(new Instance("House and Garden"));
		magazineRack.add(new Instance("GQ"));

		System.out.println(magazineRack);
	}
}
