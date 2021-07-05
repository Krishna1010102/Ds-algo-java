package ForLoops;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				for(int j=1;j<=i;j++) {
				System.out.print("x ");
			    }
			
			}
			else {
				System.out.print("x ");
				for(int j=1;j<=i-2;j++) {
					System.out.print("  ");
				}
				System.out.print("x ");
				
			}
			System.out.println();
		}
		
			}

	}


