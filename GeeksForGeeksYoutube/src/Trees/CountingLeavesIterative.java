package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Trees.LevelOrderTraversal;

public class CountingLeavesIterative {
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
	public static int countingLeaves(Node node){
		int count = 0;
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		while(!que.isEmpty()){
			Node n = que.poll();
			if(n.left == null && n.right == null) count++;
			if(n.left != null) que.add(n.left);
			if(n.right != null) que.add(n.right);
		}
		return count;
	}
	public static void main(String[] args){
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
		System.out.println("Leaves = "+countingLeaves(root));
	}
}
