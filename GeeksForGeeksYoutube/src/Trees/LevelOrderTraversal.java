package Trees;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}
public class LevelOrderTraversal {
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
	public static void lst(Node node){
		Queue<Node> que = new LinkedList<>();
		que.add(node);
		while(!que.isEmpty()){
			Node n = que.poll();
			System.out.println(n.data);
			if(n.left != null) que.add(n.left);
			if(n.right != null) que.add(n.right);
		}
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
		lst(root);
	}

}
