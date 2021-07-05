package ForLoops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<n;i++) {//a number always has a factor between 1 to root n ;
			if(n % i==0) {
				isPrime = false;
				break;
			}
		}
       if(n==1) {
    	   isPrime = false;
       }
       System.out.println("isPrime  "+ isPrime);
	}

}
