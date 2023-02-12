package datastructures;

import java.util.Stack;

public class StackBottomInsert {
	static void bottomInsert(Stack<Integer> ss, int value){
		int temp;
		if(ss.empty())
			ss.push(value);
		else{
			temp = ss.pop();
			bottomInsert(ss,value);
			ss.push(temp);
		}
	}

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);//[1,2,3]
		bottomInsert(s,999);
		bottomInsert(s,888);
		System.out.println(s);//[888,999,1,2,3]
	}

}
