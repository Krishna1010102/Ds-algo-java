package gfg;

import java.util.Scanner;

class Rotation{
	
	public void rotateTheArray(int[] arr) {
		int x=arr[arr.length-1];
		   for(int i=arr.length-1;i>0;i--) {
			   arr[i]=arr[i-1];
			  }
		      arr[0]=x;		
	}
	
}


public class Rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
      int t=sc.nextInt();
    //	System.out.println("how many times you want to rotate");
      for(int k=0;k<t;k++) {
		int n=sc.nextInt();
		int r=sc.nextInt();
		Rotation obj = new Rotation();
		
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	   
	   
	   for(int i=0;i<r;i++) {
	     obj.rotateTheArray(arr);
	   }
	      for(int c:arr) {
	    	  System.out.print(c+" ");
	      }
	      
      }    
	   
		
		
		

	}
   
}
