package dequeue;

public class Mydeque<E> {
	
	node<E> head,tail;
	
	public void addFirst(E data) {
		node<E> toAdd = new node<>(data);
		if(head == null) {
			
			head = tail = toAdd;
		}
		
		head.next = toAdd;
		toAdd.prev = head;
		head = head.next;
		
	}
	
	public void addLast(E e) {
		node<E> toAdd = new node<>(e);
		if(head == null) {
			head = tail = toAdd;
		} 
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = tail.prev;
	}
	
	 public E removeFirst() {
		 node<E> toRemove = head;
		 
		 if(head == null) {
			 return null;
		 }
		 
		 if(head.prev == null && head.next==null) {
			 toRemove= head;
			 head = tail = null;
			 return toRemove.data;
		 }
		 
		 head = head.prev;
		 head.next= null;
		 toRemove.prev=null;
		 
		 
		 return toRemove.data;
		 
	 }
	
	public E removeLast() {
		node<E> toRemove =tail;
		
		if(head == null) {
			
			return null;
		}
		if(head.next == null && head.prev == null) {
			E value = head.data;
			head = tail = null;
			return value;
		}
		tail = tail.next;
		tail.prev = null;
		toRemove.next = null;
		
		
		return toRemove.data;
		
		
	}
	
	public E peekFirst() {
		
		if(head==null)return null;
		return head.data;
		
		
	}
	public E peekLast() {
		
		if(head==null)return null;
		return tail.data;
	}
	
	    public static class node<E>{
		E data;
		node<E> next,prev;
		public node(E data) {
			this.data = data;
			this.next = this.prev = null;
			
		}
	}
	
	

}
