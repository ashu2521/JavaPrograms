package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumDepthRecursion {
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
	static int min(int a, int b){
		return a > b ? b : a;
	}
	public static int minDepth(Node node){
		if(node == null)
			return 0;
	return min(minDepth(node.left), minDepth(node.right)) + 1;
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
		System.out.println(minDepth(root));
	}
}
