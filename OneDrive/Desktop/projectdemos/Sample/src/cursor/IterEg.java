package cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterEg {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		
		l.add(2);
		l.add(54);
		l.add(67);
		l.add(24);
		l.add(26);
		
//		Iterator i=l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		//i.remove();
		
		Iterator g=l.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
			l.add(28);
		}
		
		
		

	}

}
