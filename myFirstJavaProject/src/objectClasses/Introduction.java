package objectClasses;


class Cat{
	int legs=0;
	int fingers=0;
	 void walking() {
		System.out.println("running");
	}
	void discription() {
		System.out.println("the cat has "+legs+" legs and "+fingers+" fingers!");
	}
}

public class Introduction {

	public static void main(String[] args) {
	    Cat a = new Cat();
	    a.legs=4;
	    a.fingers=5;
	    a.walking();
	    a.discription();
	    
	    
		

	}

}
