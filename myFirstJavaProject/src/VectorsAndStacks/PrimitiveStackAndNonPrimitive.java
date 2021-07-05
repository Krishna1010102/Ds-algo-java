package VectorsAndStacks;

import java.util.Stack;
//import java.util.Vector;

public class PrimitiveStackAndNonPrimitive{

	public static void main(String[] args)throws Exception {
//		Vector<Integer> vrr = new Vector<>();
//		
//		vrr.add(25);
//		vrr.add(250);
//		vrr.add(2);
//		vrr.add(5);
		//System.out.println(vrr);
	  Mystack<Integer> srr = new Mystack<>();
	  
	  srr.push(10);
	  srr.push(1);
	  srr.push(100);
	  
	  System.out.println(srr.peek());
	  int y=srr.pop();
	  System.out.println(srr.peek());
	  System.out.println();

		  
//      int i=srr.peek();	  
//      System.out.println(i);

	 
//	  e =srr.pop();
	  //i=srr.peek();
	  //System.out.println(i);
//	  System.out.println(e);
	  }
	  
	}


