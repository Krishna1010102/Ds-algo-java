import java.util.ArrayList;

public class bunary {

	public static void main(String[] args) {
		int n =5;
		System.out.println(n);

		conversion(n);
		System.out.println(n);

	}
	public static void conversion(int n) {
		int temp =n;
		ArrayList<Integer> arr = new ArrayList<>();
		while(temp > 0) {
			int i=temp%2;
			arr.add(0, i);
			temp = temp/2;
			
		}
        System.out.println(arr);		
		
		
	}

}
