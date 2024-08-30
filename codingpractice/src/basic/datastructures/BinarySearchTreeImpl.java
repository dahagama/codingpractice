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
	
	public BinarySearchTreeNode removeNode(BinarySearchTreeNode root, int val)
    {
        if(root == null)
            return null;
        if(root.key < val)
            root.right = removeNode(root.right,val);
        else if(root.key > val)
            root.left = removeNode(root.left,val);
        else
        {
            if(root.left == null && root.right == null)
                return null;
            else if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else
            {
                int rightMin = getRightMin(root.right);
                root.key = rightMin;
                root.right = removeNode(root.right,rightMin);
            }
        }
        return root;
    }

    public int getRightMin(BinarySearchTreeNode root)
    {
    	BinarySearchTreeNode temp = root;

        while(temp.left != null)
        {
            temp = temp.left;
        }

        return temp.key;
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
