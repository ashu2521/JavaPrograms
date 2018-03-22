package Trees;

import java.util.Scanner;

public class SizeOfBinaryTreeRecursive {
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
	
	public static int sizeOf(Node node){
		if(node == null)
			return 0;
		else 
			return sizeOf(node.left) + 1 + sizeOf(node.right);
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
		System.out.println(sizeOf(root));
		sc.close();
	}


}
