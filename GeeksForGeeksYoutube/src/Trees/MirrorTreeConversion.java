package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MirrorTreeConversion {
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

	public static void convertToMirror(Node node){
		if(node == null)
			return;
		
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		convertToMirror(node.left);
		convertToMirror(node.right);
	}
	public static void lst(Node node) {
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		while (!que.isEmpty()) {
			Node n = que.poll();
			System.out.print(n.data + " ");
			if (n.left != null)
				que.add(n.left);
			if (n.right != null)
				que.add(n.right);
		}
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
		convertToMirror(root);
		lst(root);
	}
}
