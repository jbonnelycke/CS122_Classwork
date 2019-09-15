//Basic architecture used as reference
//is "magazine" linked list in Lewis Loftus
public class LinkedListADT {
	private LinkNode list;

	// Sets up an initially empty list
	public LinkedListADT() {
		list = null;
	}

	// Creates a new LinkNode object
	// If the list is empty, the first node "is" the list
	// Otherwise, the node is added to the front of the
	// previous node.
	public void add(Instance nodeName) {
		LinkNode node = new LinkNode(nodeName);
		LinkNode current;

		if (list == null)
			list = node; // first node "is" the list
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node; // adds the next node
		}
	}

	public String toString() {
		String result = "";
		LinkNode current = list;

		while (current != null) {
			result += current.linkedListLink + "\n";
			current = current.next;
		}
		return result;
	}

	// An inner class that represents a node in the linked list.
	// The public variables are accessed by the LinkedListADT class.
	private class LinkNode {
		public Instance linkedListLink;
		public LinkNode next;

		// Sets up the linked list's node
		public LinkNode(Instance listLink) {
			linkedListLink = listLink;
			next = null;
		}
	}
}
