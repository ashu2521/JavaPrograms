package Trees;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;
import Trees.LevelOrderTraversal;
public class RevOrderTraversal {
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
		Stack<Node> stack = new Stack<>();
		que.add(node);
		while(!que.isEmpty()){
			Node n = que.poll();
			stack.push(n);
			if(n.right != null) que.add(n.right);
			if(n.left != null) que.add(n.left);	
		}
		Node n = null;
		while(!stack.isEmpty()){
			n = stack.pop();
			System.out.print(n.data+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null;
		int x = 0;
		System.out.println("Enter NUMBER of data for RevLevelOrder");
		int n = sc.nextInt();
		while( n-- > 0)
		{
			int data = sc.nextInt();
			root = insert(root, data);
		}
		lst(root);
	}

}
