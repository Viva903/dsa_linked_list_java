package datastructures.binarysearchtree;

public class BinarySearchTree {

	Node root;

	class Node {
		Node left;
		Node right;
		int value;

		Node(int value) {
			this.value = value;
		}
	}

	public boolean insert(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (temp != null) {
			if (newNode.value > temp.value) {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				} else {
					temp = temp.right;
				}
			}
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				} else {
					temp = temp.left;
				}
			}
			if (temp.value == newNode.value) {
				return false;
			}
		}
		return false;
	}

	public boolean contains(int value) {
		Node temp = root;

		while (temp != null) {
			if (temp.value == value) return true;
			if(value > temp.value) {
				temp = temp.right;
			}
			if (value < temp.value) {
				temp = temp.left;
			}
		}

		return false;
	}
}
