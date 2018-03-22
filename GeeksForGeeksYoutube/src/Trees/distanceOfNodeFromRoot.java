package Trees;

import java.util.Scanner;

public class distanceOfNodeFromRoot {
	public static int printDistOfK(Node node, int data, int dist) {
		if (node == null)
			return -1;

		if (data == node.data)
			return dist;
			

		if(data < node.data)dist = printDistOfK(node.left,  data, dist + 1);
		if(data > node.data) dist = printDistOfK(node.right, data, dist + 1);

		return dist;
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
		System.out.println("Enter Data : ");
		int k = sc.nextInt();
		System.out.println(printDistOfK(root, k, 0));;
	}
}
