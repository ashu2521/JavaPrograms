package Trees;

import java.util.Scanner;

public class SumOfPathRecursive {
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
	public static int pathSum(Node node, int sum){
		if(node == null)
			return 0;
		sum = sum * 10 + node.data;
		if(node.left == null && node.right == null)
			return sum;
		return pathSum(node.left, sum) + pathSum(node.right, sum);
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
		System.out.println(pathSum(root, 0));
	}
}
