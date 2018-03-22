package Trees;

import java.util.Scanner;
import java.util.Stack;
import Trees.LevelOrderTraversal;

public class IterativePostOrder {
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

	public static void postOrder(Node node) {
		if (node == null)
			return;

		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack1.push(node);
		while (!stack1.isEmpty()) {
			node = stack1.pop();
			if (node.left != null)
				stack1.push(node.left);
			if (node.right != null)
				stack1.push(node.right);

			stack2.push(node);
		}
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop().data + " ");
		}
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
		postOrder(root);
	}
}
