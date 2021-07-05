package String;

public class StringReverse {

	public static void main(String[] args) {
		String a="i love my india";
     	 String b[]=a.split(" ",5);
     	 int n=b.length;

		System.out.println(a);
		System.out.println(b[0]);
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(b[n-1]);

	}

}
