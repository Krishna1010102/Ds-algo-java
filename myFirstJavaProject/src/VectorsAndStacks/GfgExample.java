package VectorsAndStacks;

import java.util.Stack;

public class GfgExample {

	public static void main(String[] args) {
		String s ="{}{(}))}";
		Stack<Character> c = new Stack<>();
		boolean isBalanced = true;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(') {
				c.push(s.charAt(i));
			}
			else if(s.charAt(i)==']') {
				if(c.empty())isBalanced = false;
//				else if(c.peek()==)
				
			}
			
			
			
		
		}
		

	}

}
