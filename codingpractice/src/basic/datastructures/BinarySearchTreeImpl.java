package basic.datastructures;

public class BinarySearchTreeImpl {
	BinarySearchTreeNode root = null;
	
	public BinarySearchTreeNode insert(BinarySearchTreeNode root, int val) {
		if(root==null)
			return new BinarySearchTreeNode(val);
		else if(root.key<val)
			root.right = insert(root.right,val);
		else if(root.key>val)
			root.left= insert(root.left,val);	
		return root;
	}
	
	public static void inOrder(BinarySearchTreeNode root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.key+ "");
		inOrder(root.right);
	}
	
	public boolean search(BinarySearchTreeNode root, int key) {
		if(root == null)
			return false;
		
		if(root.key == key)
			return true;
		if(root.key<key)
			return search(root.right,key);
		else
			return search(root.left,key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 125);
		
		inOrder(bst.root);
	}

}
