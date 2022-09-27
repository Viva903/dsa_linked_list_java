package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

	    LinkedList myLinkedList = new LinkedList(1);
	    myLinkedList.append(2);
	    
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		
		System.out.println("\nLinked List:");
		myLinkedList.printList();
		  
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		        
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeLast().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList.removeLast().value);
		System.out.println(myLinkedList.removeLast().value);
		System.out.println(myLinkedList.removeLast().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeLast().value);
		System.out.println(myLinkedList.removeLast());

		//prepend
		myLinkedList.append(3);
		myLinkedList.append(2);
        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
		
        
        System.out.println("\n\nAfter removeFirst():");
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst());
        
		myLinkedList.append(3);
		myLinkedList.append(2);
        myLinkedList.prepend(1);
        myLinkedList.prepend(4);
        
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        
        System.out.println("\n Get");
        System.out.println(myLinkedList.get(0).value);
        
        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();
        

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();
    }

}