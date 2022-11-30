package datastructures;

public class QueueImpl {
	
	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	
	private Node head; // remove from head -- first in
	private Node tail; // add here -- need to stand in the queue
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		if(head==null)
			return 0;
		return head.data;
	}
	
	public void add(int data) {
		Node newnode = new Node(data);
		if(tail!=null) {
			tail.next=newnode;
		}		
		tail=newnode;		
		if(head==null) {
			head=newnode;
		}	
	}
	
	public int remove() {
		int data = head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
