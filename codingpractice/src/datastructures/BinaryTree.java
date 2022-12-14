package datastructures;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

public class BinaryTree {
	
	Node root;
	
	
	 /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node root)
    {
        if (root == null)
            return;
 
        /* first recur on left child */
        printInorder(root.left);
 
        /* then print the data of node */
        System.out.print(root.value + " ");
 
        /* now recur on right child */
        printInorder(root.right);
    }
    
	public void preOrder(Node root) {
		if(root==null)
			return;
		/* then print the data of node */
        System.out.print(root.value + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void printPostorder(Node root)
    {
        if (root == null)
            return;
 
        // first recur on left subtree
        printPostorder(root.left);
 
        // then recur on right subtree
        printPostorder(root.right);
 
        // now deal with the node
        System.out.print(root.value + " ");
    }
	
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	

	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	public boolean isEmpty() {
        return root == null;
    }
	
	public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }
    
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
    
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            visit(node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node.value);
        }
    }
    
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
    
    private void visit(int value) {
        System.out.print(" " + value);        
    }
    
   
    

}
