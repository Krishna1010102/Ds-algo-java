package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {6,5,7,2,3,-7,8,2};
		int n =a.length;
		int temp=0;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
					
				}
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		
		
	}
}
