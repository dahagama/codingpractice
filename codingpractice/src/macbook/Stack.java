package macbook;

public class Stack {
	static final int MAX = 5;
	int top;
	int a[] = new int[MAX];
	
	public Stack() {
		// TODO Auto-generated constructor stub
		top = -1;
	}
	
	boolean isEmpty() {
		return top <0;
	}
	
	boolean isFull() {
		if(top>=MAX-1) {
			return true;
		} else {
			return false;
		}
	}
	
	void stackPush(int item) {
		if(isFull()) {
			System.out.println("Stack is full"); 
			
		}
		
		a[++top] = item;
		System.out.println("Pushed at: " + top);
	}
	
	int stackPop()
	{
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return a[top--];
	}
	
	void stackClear() {
		top =-1;
	}
	
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.stackPush(10);
		stack.stackPush(20);
		stack.stackPush(30);
		stack.stackPush(40);
		stack.stackPush(50);
		stack.stackPush(60);
		System.out.println("Item popped from Stack: "+ stack.stackPop());
	}

}
