package dequeue;

import java.util.ArrayDeque;

public class Arraydequeue {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(10);
		ad.addFirst(20);
		ad.addFirst(30);
		ad.addFirst(40);
		ad.addFirst(50);
		
		System.out.println(ad.pop());
		

	}

}
