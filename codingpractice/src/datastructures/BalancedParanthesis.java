package datastructures;

import java.util.Stack;

public class BalancedParanthesis {
	
	static boolean isBalancedParenthesis(String exp){
		Stack<Character> s = new Stack<Character>();
		for(char ch:exp.toCharArray()){
			switch(ch){
			case '(':
			case '[':
			case '{':
						s.push(ch); break;
			case ')':
						if(s.pop()!='(')
							return false;
						break;
			case ']': 
						if(s.pop()!='[')
							return false;
						break;
			case '}':
						if(s.pop()!='{')
							return false;
						break;
			}
		}
			return s.empty();
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isBalancedParenthesis("()"));//true
		System.out.println(isBalancedParenthesis("()[{}"));//false
	}

}
