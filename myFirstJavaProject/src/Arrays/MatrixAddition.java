package Arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of rows and column");
		int rows=sc.nextInt();
		int column =sc.nextInt();
				
		int[][] a= new int[rows][column];
		int[][] b= new int[rows][column];
		System.out.println("Enter values of first array");
		for(int i=0;i<rows;i++){
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		
          	}
		System.out.println("Enter values of secind array");
		for(int i=0;i<rows;i++){
			for(int j=0;j<column;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("addition matrix is");
			
		//int[][] additionMatrix= new int[3][3];
		for(int i=0;i<rows;i++){
			for(int j=0;j<column;j++) {
//				additionMatrix[i][j] = 
						System.out.print(a[i][j]+b[i][j]+" "); 
			}
			System.out.println();
		}
//		System.out.println("addition matrix is");
//		for(int i=0;i<rows;i++){
//			for(int j=0;j<column;j++) {
//				System.out.print(additionMatrix[i][j]+" ");
//			}
//			System.out.println();
//			
//	}
			
			
	}

}

