package datastructures;

import java.util.Stack;

public class StackSortedInsert {
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
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(3);
		s.push(4);
		System.out.println(s);//[1,3,4]
		sortedInsert(s,2);
		System.out.println(s);//[1,2,3,4]
	}

}
