package sets;
import java.util.*;

public class SubArrayOfSumZero {

	public static void main(String[] args) {
		int a[]= {2,2,2,-4};
		int k=6;
		int n=a.length;
		boolean found = false;
		
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=i;j<n;j++) {
//				
//				sum+=a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//		}
		//brute force or greedy approach of time complexity of o(n*n);
		//with the help of sets;
		
		Set<Integer> set = new HashSet<>();
		int sum=0;
//		int counter=0;
//		for(int i=0;i<n;i++) {
//			set.add(sum);
//			sum = sum+a[i];
//			counter++;
//			
//			if(set.contains(sum)) {
//				found = true;
//				break;
//			}
//			
//		}
		for(int element : a ) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
			
		}
		//System.out.println(counter);
		if(found)System.out.println("found "+found);
		else System.out.println("found " +  found);

	}

}
