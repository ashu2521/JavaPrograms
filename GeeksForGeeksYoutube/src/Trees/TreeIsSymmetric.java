package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeIsSymmetric {
	public static boolean isSymmetric(Node node) {
		Queue<Node> que = new LinkedList<>();
		que.add(node.left);
		que.add(node.right);

		boolean isSymmetric = true;
		while (!que.isEmpty()) {
			Node left = que.poll();
			Node right = que.poll();

			if (right == null && left == null)
				continue;

			if (left != null && right == null || left == null && right != null)
				return false;

			if (left.data != right.data)
				return false;

			que.add(left.left);
			que.add(right.right);
			que.add(left.right);
			que.add(right.left);
		}
		return true;
	}

	public static Node insert(Node node, int data) {
		if (node == null)
			return (new Node(data));
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		Node temp1 = null;
		while (true) {
			Node temp2 = que.poll();
			if (temp2.left == null || temp2.right == null) {
				temp1 = temp2;
				break;
			}
			que.add(temp2.left);
			que.add(temp2.right);
		}
		if (temp1.left == null)
			temp1.left = new Node(data);
		else
			temp1.right = new Node(data);
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
		boolean symmetric = isSymmetric(root);
		System.out.println(symmetric);
	}
}
