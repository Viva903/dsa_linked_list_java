package algo.treetravesal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
		} else {
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

				else if (newNode.value < temp.value) {
					if (temp.left == null) {
						temp.left = newNode;
					} else {
						temp = temp.left;
					}
				}

				else if (temp.value == newNode.value) {
					break;
				}
			}
		}
		return false;
	}

	public ArrayList<Integer> BFS() {
		ArrayList<Integer> results = new ArrayList<>();
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		queue.add(currentNode);

		while (queue.size() > 0) {
			currentNode = queue.remove();
			results.add(currentNode.value);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}

		return results;
	}

	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> result = new ArrayList<>();

		class Traverse {

			Traverse(Node node) {
				result.add(node.value);
				if (node.left != null) {
					new Traverse(node.left);
				} 

				if (node.right != null) {
					new Traverse(node.right);
				} 
			}
		}

		new Traverse(root);
		return result;
	}
	
	public ArrayList<Integer> DFSPostOrder() {
		ArrayList<Integer> result = new ArrayList<>();

		class Traverse {

			Traverse(Node node) {
				
				if (node.left != null) {
					new Traverse(node.left);
				} 

				if (node.right != null) {
					new Traverse(node.right);
				} 
				result.add(node.value);
			}
		}

		new Traverse(root);
		return result;
	}
	
	public ArrayList<Integer> DFSInOrder() {
		ArrayList<Integer> result = new ArrayList<>();

		class Traverse {

			Traverse(Node node) {
				
				if (node.left != null) {
					new Traverse(node.left);
				} 
				result.add(node.value);
				if (node.right != null) {
					new Traverse(node.right);
				} 

			}
		}

		new Traverse(root);
		return result;
	}
}
