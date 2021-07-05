package VectorsAndStacks;

import list.MyLinkedList;

public class Mystack<E> {
	
	MyLinkedList<E> ll= new MyLinkedList<>();
	
	public void push(E e) {
		
		ll.add(e);
	}
	
	E pop() throws Exception{
		
		if(ll.isEmpty()) {
			throw new Exception("can't pop from epmty stack");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("stack is empty");
			
		}
		return ll.getLast();
		
	}

}
