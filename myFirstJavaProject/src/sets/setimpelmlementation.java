package sets;

import java.util.*;

public class setimpelmlementation {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add(410);
		set.add(2310);
		set.add(100);
		
		System.out.println(set);
		set2.add(10);
		set2.add(100);
		set2.add(2310);
		//set2.add(50);
		
		System.out.println(set.containsAll(set2));
		
		System.out.println(set);
	

	}

}
