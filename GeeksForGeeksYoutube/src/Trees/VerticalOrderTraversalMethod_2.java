//==============Using Mapping=================
//Time comlexity O(nlogn)

package Trees;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class VerticalOrderTraversalMethod_2 {
	public static void mapVerticalValue(Node node, TreeMap<Integer, LinkedList<Integer>> map, int verticalPos) {
		if (node == null)
			return;

		LinkedList<Integer> link = map.get(verticalPos);
		if (link == null)
			map.put(verticalPos, new LinkedList<>());
		
		link.add(node.data);
		map.put(verticalPos, link);

		mapVerticalValue(node.left, map, verticalPos - 1);
		mapVerticalValue(node.right, map, verticalPos + 1);
	}
	public static void verticalOrderTraversal(Node node) {
		TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>();
		mapVerticalValue(node, map, 0);

		for (Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getValue());
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
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter NUMBER of data");
		int n = sc.nextInt();
		while (n-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		verticalOrderTraversal(root);
		sc.close();
	}
}