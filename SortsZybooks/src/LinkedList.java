
class LinkedList {
	Node head;

	static class Node {
		int val;
		Node next;

		Node(int data) {
			val = data;
			next = null;
		}
	}

	public static void print(Node head) {
		Node node = head;
		while (node != null) {
			if (node.next == null)
				System.out.print(node.val);
			else
				System.out.print(node.val + " ");
			node = node.next;
		}

	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Node head_node = new Node(1);
		list.head = head_node;
		Node second = new Node(2);
		list.head.next = second;
		Node third = new Node(2);
		second.next = third;
		Node fourth = new Node(2);
		third.next = fourth;
		Node fifth = new Node(3);
		fourth.next = fifth;
		Node sixth = new Node(3);
		fifth.next = sixth;
		Node seventh = new Node(4);
		sixth.next = seventh;
		Node eighth = new Node(5);
		seventh.next = eighth;
		Node ninth = new Node(5);
		eighth.next = ninth;
		ninth.next = null;

		removeDuplicates(list.head);
		print(list.head);
		funct(list.head);
		
	}

	public static void removeDuplicates(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			} else
				temp = temp.next;
		}
	}
	static int funct(Node head) {
		if (head == null)
			return 0;
		else
			return head.val + funct(head.next);
	}

}