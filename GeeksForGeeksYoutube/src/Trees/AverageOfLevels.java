package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AverageOfLevels {
	public static void averageOfLevels(Node node){
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		int level = 1;
		while(!que.isEmpty()){
			Queue<Node> temp = new LinkedList<>();
			int sum = 0, no_node = 0;
			
			while(!que.isEmpty()){
				Node n = que.poll();
				sum+=n.data;
				no_node++;
				if(n.left != null) temp.add(n.left);
				if(n.right != null) temp.add(n.right);
			}
			System.out.println("Average of Level "+level+" is "+((float)sum/no_node) );
			level++;
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		averageOfLevels(root);
		sc.close();
	}
}
