package datastructures;

import java.util.Stack;

public class SortStack {
	static void sortedInsert(Stack<Integer> ss,int value){
		int temp;
		if(ss.empty() || value>ss.peek())
			ss.push(value);
		else{
			temp = ss.pop();
			sortedInsert(ss,value);
			ss.push(temp);
		}
	}
	static void sortStack(Stack<Integer> ss){
		int temp;
		if(ss.empty()==false){
			temp = ss.pop();
			sortStack(ss);
			sortedInsert(ss,temp);
		}
	}
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(3);
		s.push(1);
		s.push(4);
		s.push(2);
		System.out.println(s);//[5,3,1,4,2]
		sortStack(s);
		System.out.println(s);//[1,2,3,4,5]
	}

}
