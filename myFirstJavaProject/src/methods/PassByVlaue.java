package methods;

public class PassByVlaue {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		swapOfTwoNumber(a,b);
		System.out.println(a+" "+b);

	}
	
	static void swapOfTwoNumber(int a,int b ){
		int temp=a;
		a=b;
		b=temp;
	}
}
