package basic.datastructures;

public class QueueLinkedListImpl {
	Node front = null, rear = null;
	
	public void enqueue(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;
		
		if(front == null && rear == null) {
			front=rear=newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	
	public void dequeue() {
		if(front == null) {
			System.out.println("Queue is Empty. Unable to perform dequeue.");
		}else {
			System.out.println("Dequeued Element = "+ front.data);
			front = front.next;
			if(front==null) {
				rear=null;
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
