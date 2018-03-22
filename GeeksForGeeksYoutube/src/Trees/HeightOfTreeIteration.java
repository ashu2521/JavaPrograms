package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Values2 {
	Node node;
	int height;

	Values2(Node node, int height) {
		this.height = height;
		this.node = node;
	}
}

public class HeightOfTreeIteration {
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

	public static void heightUsingLevel(Node node) {
		Queue<Values2> que = new LinkedList<>();
		int height = 0;
		que.add(new Values2(node, 1));
		while (!que.isEmpty()) {
			Values2 value = que.poll();
			if (value.node.left != null)
				que.add(new Values2(value.node.left, value.height + 1));
			if (value.node.right != null)
				que.add(new Values2(value.node.right, value.height + 1));
			if(value.height > height)
				height = value.height;
		}
		System.out.println("Height of Tree = "+height);
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
		heightUsingLevel(root);
		sc.close();
	}

}
