package Trees;
import java.util.Scanner;

import Trees.LevelOrderTraversal;
public class CountingLeavesRecursion {

	public static Node insert(Node node, int data){
		if(node == null)
			return (new Node(data)); 
		else if(data > node.data)
			node.right = insert(node.right, data);
		else if(data < node.data)
			node.left = insert(node.left, data);
		else
			return node;
		return node;
	}
	static int leavesCount(Node node){
		int count = 0;
		if(node == null)
			return 0;
		if(node.left != null && node.right != null)
			return 1;
		else
			count = leavesCount(node.left) + leavesCount(node.right); 
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null; 
		int x = 0;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while( n-- > 0)
		{
			int data = sc.nextInt();
			root = insert(root, data);
		}
		System.out.println("Leaves = "+leavesCount(root));
	}

}
