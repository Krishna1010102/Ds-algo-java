package calulator;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the java Calculator which operation you want to try");
		System.out.println("1.addition \n2.substraction" +"\n3.division "+ "\n4.multiplication");
		int i= sc.nextInt();
		int temp=1;
		do {
		switch(i) {
		case 1:
			
			System.out.println("first no.");
			a= sc.nextInt();
			System.out.println("second no.");
			b= sc.nextInt();
			c = a+b;
			System.out.println("your answer is "+ c );
			break;
        case 2:
			
			System.out.println("first no.");
			a= sc.nextInt();
			System.out.println("second no.");
			b= sc.nextInt();
			c = a - b;
			System.out.println("your answer is "+ c );
			
			int z;
			break;
        case 3:
	
	        System.out.println("first no.");
	        a= sc.nextInt();
	        System.out.println("second no.");
	        b= sc.nextInt();
	        c = a/b;
	       System.out.println("your answer is "+ c );
	       break;
        case 4:
	
	        System.out.println("first no.");
	        a= sc.nextInt();
	        System.out.println("second no.");
	        b= sc.nextInt();
	        c = a*b;
	        System.out.println("your answer is "+ c );
	        break;
	     default:
	    	 System.out.println("wrong input");
	    	 
	    }
		System.out.println("do ypo want to continue \n press 1 to continue /n zero to exit");
		temp = sc .nextInt();
         
		
		sc.close();
	}while(temp !=0);

	}

}
