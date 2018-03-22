//Worst Case: O(nlogn)
//Prints Exactly Level Wise The Vertical Order
package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map.Entry;

class Values{
	Node node;
	int hd;
	Values(Node node, int hd){
		this.node = node;
		this.hd = hd;
	}
}
public class VerticalOrderTraversalMethod_3 {
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
	public static void printVerticalMap(TreeMap<Integer, LinkedList<Integer>> map){
		for(Entry<Integer, LinkedList<Integer>> entry: map.entrySet()){
			System.out.println(entry.getValue());
		}
	}
	public static void verticalTraversalUsingLST(Node node){
		if(node == null)
			return;
		
		TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>();
		Queue<Values> que1 = new LinkedList<>();
		que1.add(new Values(node, 0));
		while(!que1.isEmpty()){
			Values value = que1.poll();
			Node n = value.node;
			int hd = value.hd;
			
			if(n.left != null)	que1.add(new Values(n.left, hd -1));
			if(n.right != null) que1.add(new Values(n.right, hd + 1));
	
			if(map.get(hd) == null){
				map.put(hd, new LinkedList<Integer>());
			}
			map.get(hd).add(n.data);
		}
		printVerticalMap(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = null; 
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while( n-- > 0)
		{
			int data = sc.nextInt();
			root = insert(root, data);
		}
		verticalTraversalUsingLST(root);
		sc.close();
	}
}
