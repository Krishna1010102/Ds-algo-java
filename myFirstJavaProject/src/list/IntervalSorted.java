package list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntervalSorted {
	

	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(4,20));
		intervals.add(new Interval(1,5));
		intervals.add(new Interval(3,7));
		intervals.add(new Interval(6,10));
		System.out.println(intervals);
		Solution obj = new Solution();
		System.out.println(obj.merge(intervals));
		Interval c  = new Interval(10,20);
		int x=c.end;
		System.out.println(c.start+" "+c.end);
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(8);
		a.add(10);
		System.out.println(a);
		
		
		

	}

}
class Interval{
	int start;
	int end;
	public Interval() {
		start=0;
		end=0;
		
	}
	public Interval(int start,int end) {
		this.start=start;
		this.end=end;
		
	}
	
	
}


class Solution{
	
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals){
		
		if(intervals.size()<2) {
		   return intervals;
		}
		ArrayList<Interval> output = new ArrayList<>();
		 Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
		 Interval temp = intervals.get(0);
		 int start=temp.start;
		 int end =temp.end;
		 
		 for(int i=0;i<intervals.size();i++) {
			 temp=intervals.get(i);
			 if(temp.start<=end) {
				 
				 end=Math.max(temp.end,end);
			 }
			 else {
				 output.add(new Interval(start,end));
				 start=temp.start;
				 end=temp.end;
				 
			 }
			 
		 }
		 
		output.add(new Interval(start,end));
		return output;
	}
	
	
}
