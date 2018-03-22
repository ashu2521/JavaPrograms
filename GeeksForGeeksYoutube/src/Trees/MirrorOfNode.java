package Trees;

import java.util.Scanner;

public class MirrorOfNode {
	public static int findMirror(Node left, Node right, int data) {
		if (left == null || right == null) {
			return 0;
		}
		if (data == left.data)
			return right.data;
		if (data == right.data)
			return left.data;

		int mirror = findMirror(left.left, right.right, data);

		if (mirror != 0)
			return mirror;
		return findMirror(left.right, right.left, data);
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
		int x = 0;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		System.out.println("Enter the Node : ");
		int element = sc.nextInt();
		System.out.println(findMirror(root, root, element));
	}
}
