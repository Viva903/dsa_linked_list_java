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
        
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nLinked List:");
        myDLL.printList();

        myDLL.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nLinked List:");
        myDLL.printList();
        
        System.out.println("\nremoveFirst():");
        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());
        
        myDLL.append(1);
        myDLL.append(3);
        myDLL.append(5);
        myDLL.append(8);

        System.out.println("\nLinked List:");
        myDLL.printList();
        System.out.println("\nget():");
        System.out.println(myDLL.get(3).value);
        System.out.println(myDLL.get(2).value);
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(0).value);

        System.out.println("DLL before set():");
        myDLL.printList();

        myDLL.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL.printList();
        
        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        myDLL.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL.printList();

        myDLL.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL.printList();
        
        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL.printList();
	}

}
