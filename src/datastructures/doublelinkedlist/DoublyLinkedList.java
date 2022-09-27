package datastructures.doublelinkedlist;

public class DoublyLinkedList {
	Node tail;
	Node head;
	int length;

	class Node {
		Node next;
		Node previous;
		int value;

		Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedList(int value) {
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
			newNode.previous = tail;
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		Node toRemove = tail;
		if (length == 1) {
			head = null;
			tail = null;
			length--;
			return toRemove;
			
		} else if (length > 1) {
			
			tail = tail.previous;
			toRemove.previous = null;
			tail.next = null;
			length--;
			
			return toRemove;
		}
		
		return null;
	}

}
