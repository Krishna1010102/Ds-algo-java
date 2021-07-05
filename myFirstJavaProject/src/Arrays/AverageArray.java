package Arrays;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=marks[i];
		}
		int average =sum/n;
		System.out.println("average marks is "+average);
	}
	

}
