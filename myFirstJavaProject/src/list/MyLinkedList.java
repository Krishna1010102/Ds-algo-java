package list;

public class MyLinkedList<E> {
	
	node<E> head;
	
	 public void add(E data) {
		 node<E> toadd=new node<>(data);
		 if(isEmpty()) {
			 
			 head=toadd;
			 return;
		 }
		 else {
		 node<E> temp=head;
		 while(temp.next != null) {
			 temp=temp.next;
			}
		 temp.next=toadd;
		}
	 }
	 E get(int index) {
		 
		 if(isEmpty()) {
			 System.out.println("linked list is empty");
			 return null;
		 }
		
		 node<E> temp=head;
		 int i=index;
		 while(i>0) {
			 temp=temp.next;
			 i--;
			 if(temp==null) {
				 System.out.println("out of bound");
				 return null;
			 }
		 }
		 return temp.data;
		 
		 
	 }
	 void set(E data,int index){
		 node<E> temp=head;
		 int i=index;
		 while(i>0) {
			 temp=temp.next;
			 i--;
			
		 }
		   temp.data=data;
		 
	 }
	 
	 void remove(int index) {
		 
		 node<E> temp=head;
		 int i=index;
		 while(i-1>0) {
			 temp=temp.next;
			 i--;
			
		 }
		temp.next=temp.next.next;
		
		   
		 
	 }
	 void print() {
		 node<E> temp=head;
		 System.out.print("[");
		 while(temp != null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
			}
		System.out.print("]");
		 
		 
	 }
	public boolean isEmpty() {
		 return head==null;
	 }
	public E removeLast()throws Exception {
		node<E> toRemove; 
		if(isEmpty()) {
			throw new Exception("empty linked list");
		}
		
		
		node<E> temp=head;
		if(temp.next == null) {
			toRemove =head;
			head=null;
			return toRemove.data;
		}
		 while(temp.next.next != null) {
			 temp=temp.next;
		 }
		 toRemove = temp.next;
		 temp.next=null;
		 
		return toRemove.data;
		
	}
	
	public E getLast() throws Exception {
		node<E> toGet; 
		node<E> temp=head;
		if(temp == null) {
			throw  new Exception("stack is empty");
		}
		
		 while(temp.next != null) {
			 temp=temp.next;
		 }
		 toGet = temp;
		 
		return toGet.data;
	  }
	
	
	
	
	public static class node<E>{
		 public E data;
		 public node<E> next;
		 public node(E data) {
			 
			 this.data=data;
			 next=null;
		 }
	}


}

