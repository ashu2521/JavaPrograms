package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class NodesBetweenTwoLevel {

	public static void printBTW(int lower, Node node, int upper) {
		int level = 0;
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		while (!que.isEmpty()) {
			level++;
			Queue<Node> temp = new LinkedList<>();
			while (!que.isEmpty()) {
				Node n = que.poll();
				if (n.left != null)
					temp.add(n.left);
				if (n.right != null)
					temp.add(n.right);
				if (level >= lower && level <= upper)
					System.out.print(n.data + " ");
			}
			System.out.println("");
			que = temp;
		}
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
		System.out.println("Print Upper and Lower Bounds to print");
		int lowerlevel = sc.nextInt();
		int upperlevel = sc.nextInt();
		printBTW(lowerlevel, root, upperlevel);
	}

}
