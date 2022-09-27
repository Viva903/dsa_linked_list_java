// THIS CODE GOES IN YOUR LINKEDLIST CLASS:
// ----------------------------------------

package datastructures.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int length;

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	// //
	// //
	// //
	// //
	//////////////////////////////////////////////////////////////
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		// TODO Auto-generated constructor stub
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head: " + head.value);
	}

	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}

	public void getLength() {
		System.out.println("Length: " + length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		Node nextNode = head;
		Node toRemoveNode = tail;

		if (length > 1) {
			while (nextNode.next != tail) {
				nextNode = nextNode.next;
			}
			nextNode.next = null;
			tail = nextNode;
			length--;
			return toRemoveNode;
		} else {
			if (head != null && tail != null) {
				head = null;
				tail = null;
				length--;
				return toRemoveNode;
			}
		}
		return null;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;

		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		Node toRemoveNode = head;

		// Check if there is item in the LinkedList
		if (head != null) {
			length--;
			// Check if there is more than 1 item
			if (head.next != null) {
				head = head.next;
				toRemoveNode.next = null;
				return toRemoveNode;
			} else {
				head = null;
				tail = null;
				return toRemoveNode;
			}
		}

		return null;
	}

	public Node get(int index) {

		Node tempNode = head;
		
		if (index > 0 || index < length) {
		
			for (int i = 0; i < index; i++) {
				tempNode = tempNode.next;
			}
			return tempNode;
		}
		
		return null;
	}

	public boolean set(int index, int value) {
		
		Node tempNode = get(index);
		if (tempNode != null) {
			tempNode.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {
		
		if (index == 0) {
			prepend(value);
			return true;
		}
		
		if(index == (length - 1)) {
			append(value);
			return true;
		}
		
		if (index > 0 && index < (length-2)) {
			Node tempNode = get(index - 1);
			Node newNode = new Node(value);
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			length++;
			return true;
		}
		
		return false;
	}

	public Node remove(int index) {
		
		if (index == 0) {
			return removeFirst();
		}
		
		if (index == (length - 1)) {
			return removeLast();
		}
		
		if (index > 0 && index < (length - 1)) {
			Node toRemoveNode = get(index);
			Node oneNodeBefore = get(index - 1);
			oneNodeBefore.next = toRemoveNode.next;
			toRemoveNode.next = null;
			length--;
			return toRemoveNode;
		}
		
		
		return null;
	}

	public void reverse() {
		// flip the head an tail
		Node temp = head; 
		head = tail;
		tail = temp;
	
		Node before = null;
		Node after = temp.next;
		
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		
	}
}