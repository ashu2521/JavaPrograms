package Trees;

import java.util.Scanner;

public class NodesWithNoSiblings {
	public static void printNodesWithNoSibling(Node node){
		if(node == null)
			return;

		Node temp = null;
		if(node.left != null && node.right == null || node.left == null && node.right != null)
			temp = node.left == null ? node.right : node.left;
		
		if(temp != null) System.out.println(temp.data);
		
		printNodesWithNoSibling(node.left);
		printNodesWithNoSibling(node.right);
		
	}
	public static Node insert(Node node, int data) {
		if (node == null)
			return (new Node(data));
		else if (data > node.data)
			node.right = insert(node.right, data);
		else if (data < node.data)
			node.left = insert(node.left, data);
		else
			return node;
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		printNodesWithNoSibling(root);
		sc.close();
	}
}
