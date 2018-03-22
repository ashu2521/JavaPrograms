package Trees;

import java.util.Scanner;

public class MaxDepthRecursive {
	public static int maxDepth(Node node){
		if(node == null)
			return 0;
		
		int depthL = maxDepth(node.left);
		int depthR = maxDepth(node.right);
		
		return (depthL > depthR ? depthL+1 : depthR+1); 
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
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		System.out.println(maxDepth(root));
		sc.close();
	}
}
