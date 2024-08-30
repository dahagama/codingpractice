package basic.datastructures;

public class QueueArrayImpl {
	static final int SIZE=3;
	int arr[] = new int[SIZE];
	
	int front = 0;
	int rear = 0;
	
	public void enqueue(int val) {
		if(rear == SIZE) {
			System.out.println("");
		}else {
			arr[rear] = val;
			rear++;
		}
		
	}
	
	public void dequeue() {
		
		if(front == rear) {
			System.out.println("Queue is Empty.");
		}else {
			System.out.println("Dequeued element = "+arr[front]);
			front ++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
