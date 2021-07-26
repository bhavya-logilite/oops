package preorder_binary_tree;
class Node{
	 Node left,right;
	 int key; 
	 public Node(int item) {
		 key =item;
		 left=right=null;
	 }
}
public class preorder_tree {
	Node root;
	preorder_tree(){root =null;}
	void Display_tree(Node node) {
		if (node == null)
			return;
		System.out.print(node.key+ "");
		Display_tree(node.left);
		Display_tree(node.right);
	}
	void Display_tree() {
	Display_tree(root);
		}
	public static void main(String[] args) {
		 preorder_tree tree = new preorder_tree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        System.out.println("Preorder traversal of binary tree is ");
	            tree.Display_tree();
	}

}
