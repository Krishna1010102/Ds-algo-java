package list;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		
		arr.remove(3);
		Integer a[]=new Integer[arr.size()];
		arr.toArray(a);
		System.out.println(arr);
		for(Integer c:a) {
			System.out.println(c);
		}

	}

}
