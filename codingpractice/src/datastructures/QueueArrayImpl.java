package datastructures;

public class QueueArrayImpl {
	int front, rear, size, Q[];
	QueueArrayImpl(){
		front =-1;
		rear=-1;
		size=5;
		Q=new int[size];
	}
	
	void insert(int value) {
		if(rear==size) {
			System.out.println("NQ is full");
			return;
		}
		if(front==rear)
			front=rear=0;
		Q[rear++]=value;
	}
	
	void delete() {
		if(front==rear) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Deleted object is: "+Q[front]);
		front++;
		if(front==rear)
			front=rear=-1;
	}

}
