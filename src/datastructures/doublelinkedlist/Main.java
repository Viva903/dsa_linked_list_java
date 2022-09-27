package datastructures.doublelinkedlist;

public class Main {

	public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(2);
        
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
        
        System.out.println("\nRemove Last():");
        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeLast());
	}

}
