package ForLoops;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=10;j++) {
				
				int y=i*j;
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
