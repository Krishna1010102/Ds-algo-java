package WhileLoop;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int reversedNumber=0;
		while(temp>0) {
			int lastdigit = temp%10;
			reversedNumber=reversedNumber*10+lastdigit;
			temp /= 10;
			System.out.println(reversedNumber);
		}
		if(reversedNumber==n) {
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" not a palindrome");
		}
				
	}

}
