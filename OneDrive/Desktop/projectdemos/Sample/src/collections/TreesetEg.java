package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetEg {

	public static void main(String[] args) {
		
		Set<Integer> tset=new TreeSet<>(new MyComparator());
		tset.add(2);
		Collections.addAll(tset, 25,76,86,87);
		System.out.println(tset);
	
		
		

	}

}
class MyComparator implements Comparator<Integer>{

	

	public int compare(Integer o1, Integer o2) {
//		if(o1>o2)
//			return -1;
//		else if(o1<02)
//			return 1;
//		else
//			return 0;
//			
		return (o1>o2)?-1:(o1<o2)?+1:0;
		
	}

	
	
}