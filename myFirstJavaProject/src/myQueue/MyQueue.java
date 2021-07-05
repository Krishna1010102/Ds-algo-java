package myQueue;

import list.MyLinkedList.node;

public class MyQueue<E> {
	
	private node<E> head,rear;
	
	void enqueue(E e) {
		node<E> toAdd = new node<>(e);
		 if(head == null) {
			 head = rear = toAdd;
			 return;
		 }
		
		rear.next=toAdd;
		rear=rear.next;
	}
	E dequeue() {
		if(head == null) {
			return null;
		}
		node<E> temp = head;
		head=head.next;
		if(head == null) {
			rear = null;
		}
		
		return temp.data;
	}
	E element() {
		if(head == null) {
			return null;
		}
		node<E> temp = head;
		
		head=temp;
		
		return temp.data;
		
		
		
		
	}

}
