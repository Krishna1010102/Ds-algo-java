package list;
import java.util.*;

public class Linklists {

	public static void main(String[] args) {
//		List<Integer> l2 = new LinkedList<>();
//		l2.set(0, 1);
//		
//		List<Integer> al = new ArrayList<>();
//		diffrence(ll);
//		diffrence(al);
//		
//		
//		
//		
//
//	}
//	
//	public static void diffrence(List<Integer> ll) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i=0;i<100000;i++) {
//			
//			ll.add(0,i);
//		}
//		long end =System.currentTimeMillis();
//		System.out.println(end-start);
		MyLinkedList<Integer> ll= new MyLinkedList<>();
		for(int i=0;i<5;i++) {
			ll.add(i);
		}
		ll.print();
		System.out.println();
		System.out.println(ll.get(3));
		ll.set(6, 4);
		ll.print();
	System.out.println();
//		MyLinkedList l1= new MyLinkedList();
//	      l1.get(0);

	      ll.remove(2);
	      ll.print();
	}

}
