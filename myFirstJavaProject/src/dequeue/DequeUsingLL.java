package dequeue;

public class DequeUsingLL {

	public static void main(String[] args) {
		Mydeque<Integer> md = new Mydeque<>();
		 
		for(int i=1;i<=5;i++) {
			md.addFirst(i);
		}
		md.addLast(0);
		md.addFirst(7);
//		
//		System.out.println(md.removeFirst());
//		System.out.println(md.removeLast());
//		System.out.println(md.removeLast());
         System.out.println(md.peekFirst());
         System.out.println(md.peekLast());
	}

}
