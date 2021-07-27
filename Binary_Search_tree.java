package binary_search_tree;

public class Binary_Search_tree {

	class Node {
		int key;
		Node left,right;
		public Node(int item) {
			key = item;
			left=right=null;
		}
	}
	Node root;
	Binary_Search_tree(){
		root = null;
	}
	Node insrec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insrec(root.left, key);
		}
		else if (key > root.key) {
			root.right = insrec(root.right, key);
		}
		return root;
	}
	void insert(int key) {
		root = insrec(root, key);
	}
	void inorderrec(Node root) {
		if (root != null) {
			inorderrec(root.left);
			System.out.println(root.key);
			inorderrec(root.right);
		}
	}
	void inorder() {
		inorderrec(root);
	}
	
	public static void main(String[] args) {
		Binary_Search_tree tree= new Binary_Search_tree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.inorder();

	}

}
