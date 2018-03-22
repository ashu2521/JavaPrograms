package Trees;

import java.util.Scanner;

public class RightViewRecursion {
	static int max_right = 0;

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

	public static void rightView(Node node, int height) {
		if (node == null)
			return;
		if (height > max_right){
			System.out.print(node.data + " ");
			max_right = height;
		}
		rightView(node.right, height + 1);
		rightView(node.left, height + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null;
		int x = 0;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		rightView(root, 1);
	}
}
