package datastructures;


public class LinkedListImpl {
	
	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	Node head;
	
	public void append(int data) {
		if(head==null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next=new Node(data);	
	}
	
	public void insertAtPos(Node head, int data, int pos) {
		int i=1;
		Node temp = head;
		Node newNode = new Node(data);
		while(i<pos) {
			temp= temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head=newHead;
	}
	
	public Node deleteFromBegining(Node head) {
		head=head.next;
		return head;
	}
	
	public void deleteAtTheEnd(Node head) {
		Node temp = head;
		Node prevNode=null;
		while(temp.next!=null) {
			prevNode=temp;
			temp=temp.next;
		}
		if(temp==head) {
			head=null;
		}else {
			prevNode.next=null;
		}		
	}
	
	public void deleteFromPosition(Node head,int pos) {
		int i=1;
		Node temp=head;
		
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		
		temp.next=temp.next.next;
	}
	
	
	public void deleteWithValue(int data) {
		if(head==null) return;
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node current = head;
		while(current.next!=null) {
			if(current.next.data==data) {
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
