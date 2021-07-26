package post_order_binary_tree;

class Node {
	int key;
	Node left,right;
	public Node(int item) {
		key = item;
		left=right=null;
	}
} 
public class postorder_tree {
	Node root;
	postorder_tree(){
		root = null;
	}
	void Display_tree(Node node) {
		if(node == null)
			return;
		Display_tree(node.left);
		Display_tree(node.right);
		System.out.print(node.key + "");
		
	}
	void Display_tree() {
		Display_tree(root);
	}
	public static void main(String[] args) {
		 postorder_tree tree = new postorder_tree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);

	        System.out.println("\nPostorder traversal of binary tree is ");
	        tree.Display_tree();

	}

}
