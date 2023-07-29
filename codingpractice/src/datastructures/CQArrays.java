package datastructures;

import java.util.*;

class CQArrays{
	int front,rear,size,c,Q[];
	CQArrays(){
		front = -1;
		rear = -1;
		c = 0;
		size = 5;
		Q = new int[size];
	}
	void insert(int value){
		if(c==size){
			System.out.println("Q is full");
			return;
		}
		if(front==-1)
			front=rear=0;
		else
			rear = (rear+1)%size;
		Q[rear] = value;
		c++;
	}
	void delete(){
		if(c==0){
			System.out.println("Q is empty");
			return;
		}	
		System.out.println("Deleted item is: "+Q[front]);	
		if(front==rear)
			front=rear=-1;
		else
			front = (front+1)%size;
		c--;
	}
	void display(){
		if(c==0){
			System.out.println("Q is empty");
			return;
		}
		int i=front;
		if(front<=rear){
			while(i<=rear)
				System.out.print(Q[i++]+" ");
		}
		else{
			while(i!=rear){
				System.out.print(Q[i]+" ");
				i=(i+1)%size;
			}
			System.out.print(Q[i]);
		}
		System.out.println();
	}
}

class TestCQ 
{		
	public static void main(String[] args) 
	{
		CQArrays q = new CQArrays();
		q.insert(111);
		q.insert(222);
		q.insert(333);
		q.insert(444);
		q.insert(555);
		q.display();
		q.insert(666);//
		q.delete();//111
		q.display();
		q.insert(666);
		q.display();
	}	
}
