package algorithms;

import java.util.*;

public class SlidingWindowMax {

	public static void main(String[] args) {
		int arr[] = {4,3,2,1,5,1,2,7,9};
		int k=3;
		Solution obj = new Solution();
		int ans[]=obj.maxSlidingWindow(arr,k);
          for(int x:ans) {
        	  System.out.print(x+" ");
          }
	}
	static class Solution {
	    public int[] maxSlidingWindow(int[] a, int k) {
	        int n = a.length;
	        if(n<=1)return a;
	        
	        int ans[] = new int[n-k+1];
	        Deque<Integer> dq = new LinkedList<>();
	        int i=0;
	        for(;i<k;i++) {
	               while(!dq.isEmpty() && a[dq.peekLast()] <=a[i]) {
	        	     dq.removeLast();
	        	    }
	        	dq.addLast(i);
	        }
	        
	        for(;i<n;i++) {
	        	
	        	ans[i-k] = a[dq.peekFirst()];
	        	
	        	while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	        		dq.removeFirst();
	        	}
	        	 while(!dq.isEmpty() && a[dq.peekLast()] <=a[i]) {
	        	     dq.removeLast();
	        	    }
	            	dq.addLast(i);
	        	
	        	
	        }
	          ans[i-k] = a[dq.peekFirst()];
	        
	            return ans;
	    }
	}

}
