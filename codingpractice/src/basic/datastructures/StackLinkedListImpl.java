package basic.datastructures;

public class StackLinkedListImpl {
	Node head = null;
	
	
	public void push(int val) {
		Node newNode = new Node();
		newNode.data = val;
		
		newNode.next = head;
		
		head= newNode;
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Popped element = " + head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
