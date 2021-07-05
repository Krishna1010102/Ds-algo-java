package ForLoops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = n*2-1;
		for(int i=1;i<=row;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("x ");
				}
			   }
			else if(i>n){
				for(int k=1;k<=row-i+1;k++) {
					System.out.print("x ");
					
				}
			}
			System.out.println();
		}
	}

}
