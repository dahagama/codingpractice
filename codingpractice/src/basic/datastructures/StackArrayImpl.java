package basic.datastructures;

public class StackArrayImpl {
	static final int SIZE = 3;
	int arr[] = new int[SIZE];
	int top = -1;
	
	public void push(int val) {
		if(top == SIZE-1) {
			System.out.println("Stack is Full");
		} else {
			++top;
			arr[top] = val;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Popped element = " + arr[top]);
			top--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
