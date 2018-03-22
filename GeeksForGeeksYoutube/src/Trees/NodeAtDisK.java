package Trees;

import java.util.Scanner;

public class NodeAtDisK {
	
	public static void printNodeAtK(Node node, int k){
		if(node == null)
			return;
		
		if(k == 0)
			System.out.print(node.data+ " ");

		printNodeAtK(node.left, k-1);
		printNodeAtK(node.right, k-1);
		
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
		Scanner sc = new Scanner(System.in);
		Node root = null;
		int x = 0;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		System.out.println("Enter K : ");
		int k = sc.nextInt();
		printNodeAtK(root, k);
	}
}
