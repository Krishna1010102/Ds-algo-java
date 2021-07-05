package ForLoops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long factorial= 1 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no.");
		int n = sc.nextInt();
		if(n == 0) {factorial =1;}
		else {
		for(int i =1;i<=n;i++) {
			factorial = factorial * i;
		}
	}
		System.out.println("the factorial of the number is " + factorial);
		sc.close();
	

    }
}
