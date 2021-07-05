package myQueue;

//import java.util.LinkedList;
//import java.util.Queue;

public class QueueImp {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
//		
//		q.add(10);
//		q.add(100);
//		q.add(1000);
//		q.add(10000);
//		
//		System.out.println(q);
//        System.out.println(q.remove());
//        
       MyQueue<Integer> mq = new MyQueue<>();
        
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);
       
        
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println("top element"+mq.element());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        
        mq.enqueue(50);
        System.out.println(mq.dequeue());
	}

}
