package Trees;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;
import Trees.LevelOrderTraversal;
public class PreOrderWithoutRec {
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
	public static void traversal(Node root){
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		Node node = root;
		while(!stack.isEmpty() || node != null )
		{
			System.out.print(node.data  + " ");
			node = node.left;
			if(!stack.isEmpty() && node == null) node = stack.pop().right;
			if(node != null && node.right != null) stack.push(node); 
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
		traversal(root);
	}

}
