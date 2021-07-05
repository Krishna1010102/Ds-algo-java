package WhileLoop;

import java.util.Scanner;

public class Example {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insert a no.");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int lastdigit=temp%10;
			temp /= 10;
			sum +=lastdigit;
			System.out.println("lastdigit "+lastdigit+" temp "+temp+" sum "+sum);
		}
		System.out.println("sum of number "+n+" is "+ sum);
		
		
	}

}
