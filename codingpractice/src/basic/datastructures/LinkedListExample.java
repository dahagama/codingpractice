package basic.datastructures;

public class LinkedListExample {
	
	
	public void initNodes() {
		
	}
	
	
	public void addFirst(int val, Node head)
	{
		Node newNode= new Node();
		newNode.data=val;
		newNode.next=head;
		head=newNode;
	}
	
	public void delete(int key, Node head) {
		if(head.data==key) {
			head = (head).next;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.data==key)
				{
					temp.next=temp.next.next;
					break;
				}
				else {
					temp=temp.next;
				}
			}
		}
	}
	
	public boolean search(int key, Node head) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data==key) {
				return true;
			}else {
				temp=temp.next;
			}
		}	
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListExample linkedList = new LinkedListExample();
		//linkedList.initNodes();
		Node head, middle, last;
		head = new Node();
		middle= new Node();
		last = new Node();
		
		
		head.data =10;
		middle.data = 20;
		last.data = 30;
		
		head.next=middle;
		middle.next=last;
		last.next=null;
		
		
		System.out.println(linkedList.search(10, head));
		
		if(head.data==10) {
			head = (head).next;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.data==10)
				{
					temp.next=temp.next.next;
					break;
				}
				else {
					temp=temp.next;
				}
			}
		}
		
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
