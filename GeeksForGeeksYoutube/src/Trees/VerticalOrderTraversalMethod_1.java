//=================Using Recursion and Iteration==============
//--Time Complexity O(w*n) w = width of tree
//--Worst Case w = n therefore worst case O(n^2)
package Trees;

import java.util.Scanner;

class MinMax {
	int min, max;
}

public class VerticalOrderTraversalMethod_1 {
	public static void printVerticalValue(Node node, int i, int verticalPos) {
		if (node == null)
			return;
		if (i == verticalPos)
			System.out.print(node.data + " ");

		printVerticalValue(node.left, i, verticalPos - 1);
		printVerticalValue(node.right, i, verticalPos + 1);
	}

	public static void findMinMax(Node node, MinMax val, int verticalPos) {
		if (node == null)
			return;

		if (val.min > verticalPos)
			val.min = verticalPos;
		if (val.max < verticalPos)
			val.max = verticalPos;

		findMinMax(node.left, val, verticalPos - 1);
		findMinMax(node.right, val, verticalPos + 1);
	}

	public static void verticalOrderTraversal(Node node) {
		MinMax val = new MinMax();
		findMinMax(node, val, 0);
		for (int i = val.min; i <= val.max; i++) {
			printVerticalValue(node, i, 0);
			System.out.println("");
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
		verticalOrderTraversal(root);
	}
}
