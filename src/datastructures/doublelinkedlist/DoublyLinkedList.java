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

	public void prepend(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {

		if (length == 1) {
			Node temp = head;
			head = null;
			tail = null;
			length--;
			return temp;
		} else if (length > 1) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			head.previous = null;
			length--;
			return temp;
		}
		return null;
	}

	public Node get(int index) {

		if (index < length && index >= 0) {
			Node temp = head;

			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		}

		return null;
	}

	public boolean set(int index, int value) {

		if (length != 0) {
			Node tempNode = get(index);
			tempNode.value = value;
			return true;
		}

		return false;
	}

	public boolean insert(int index, int value) {

		Node newNode = new Node(value);
		if (length == 0 || index == 0) {
			prepend(value);
		} else if (length > 1) {
			Node before = get(index - 1);
			Node after = get(index);
			newNode.previous = before;
			newNode.next = after;
			before.next = newNode;
			after.previous = newNode;
		}
		length++;
		return false;
	}

	public Node remove(int index) {
		if (length != 0 && index == 0) {
			return removeFirst();
		} 
		
		if ((length - 1) == index) {
			return removeLast();
		} else {
			Node toRemoveNode = get(index);
			toRemoveNode.previous.next = toRemoveNode.next;
			toRemoveNode.next.previous = toRemoveNode.previous;
			length--;
			return toRemoveNode;
		}
	}

}
