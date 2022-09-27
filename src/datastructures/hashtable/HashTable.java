package datastructures.hashtable;

import java.util.ArrayList;

public class HashTable {
	int size = 7;
	Node[] dataMap;

	class Node {
		String key;
		int value;
		Node next;

		Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	HashTable() {
		dataMap = new Node[size];
	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ":");
			if (dataMap[i] != null) {
				Node temp = dataMap[i];
				while (temp != null) {
					System.out.println("   {" + temp.key + ", " + temp.value + "}");
					temp = temp.next;
				}
			}
		}
	}

	public int hash(String key) {
		int hash = 0;
		char[] asciiValues = key.toCharArray();
		for (int i = 0; i < asciiValues.length; i++) {
			hash = (hash + asciiValues[i] + 23) % dataMap.length;
		}

		return hash;
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);

		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		
		if (temp == null) return 0;

		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.value;
	}

	public ArrayList<String> keys() {
		ArrayList<String> array = new ArrayList<>();
		Node temp;
		for(int i = 0; i < dataMap.length; i++) {
			temp = dataMap[i];
			while(temp != null) {
				array.add(temp.key);
				temp = temp.next;
			}
		}
		return array;
	}

}
