public class SortedList<E extends Comparable<E>> {

	private int size;
	private Node front;

	private class Node {
		private E data;
		private Node next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E objectReference) {
			data = objectReference;
			next = null;
		}

		public Node(E objectReference, Node nextReference) {
			data = objectReference;
			next = nextReference;
		}
	}

	// External reference to find
	// the first element in this list

	// Number of elements in this list

	public SortedList() {
		front = null;
		size = 0;
	}

	public void insertInOrder(E element) {
		if (front == null) {
			Node n = new Node(element);
			front = n;
			size++;
			return;
		}
		Node n = front;
		Node newNode = new Node(element);
		if (n.data.compareTo(element) == 0) {
			return;
		}
		if (n.data.compareTo(element) > 0) {
			newNode.next = n;
			front = newNode;
			size++;
			return;
		}
		while (n.data.compareTo(element) < 0 && n.next != null) {
			if (n.data.compareTo(element) == 0) {
				return;
			}
			n = n.next;
		}
		newNode.next = n.next;
		n.next = newNode;
		size++; // unless element existed
	}

	public int size() {
		return size;
	}
	
	public void printAll() {
		if (front == null) return;
		Node n = front;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("-----------------------------------");
	}

	// add remove here
}