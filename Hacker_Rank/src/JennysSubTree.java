
import java.util.Scanner;

class NodeList {
	int data;
	NodeList childNode;
	NodeList siblingNode;

	NodeList(int data, NodeList childNode, NodeList siblingNode) {
		this.childNode = childNode;
		this.data = data;
		this.siblingNode = siblingNode;
	}
}

public class JennysSubTree {

	public static NodeList insert(NodeList node, int par, int child) {
		if (node == null)
			return new NodeList(par, new NodeList(child, null, null), null);

		NodeList temp1 = node;
		NodeList temp2 = node;
		while (temp1 != null && temp1.data != par)
			temp1 = temp1.siblingNode;

		if (temp1 == null) {
			while (temp2 != null) {
				if (temp2.childNode != null)
					temp2.childNode = insert(temp2.childNode, par, child);
				temp2 = temp2.siblingNode;
			}
		} else {
			if (temp1.childNode == null)
				temp1.childNode = new NodeList(child, null, null);
			else {
				temp1 = temp1.childNode;
				while (temp1.siblingNode != null)
					temp1 = temp1.siblingNode;
				temp1.siblingNode = new NodeList(child, null, null);
			}
		}
		return node;
	}

	public static void printListTree(NodeList node) {
		if (node == null)
			return;
		NodeList temp = node;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.siblingNode;
		}
		System.out.print("\nRoot : " + node.data + "\n");
		while (node != null) {
			printListTree(node.childNode);
			node = node.siblingNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NodeList root = null;
		System.out.println("Enter no of nodes to Enter");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Parent and child node");
			int par = sc.nextInt();
			int child = sc.nextInt();
			root = insert(root, par, child);
			printListTree(root);
		}
		sc.close();
	}

}
