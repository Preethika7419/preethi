package cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListiterEg {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		
		list.add(34);
		list.add(54);
		list.add(67);
		list.add(24);
		list.add(26);
		ListIterator i=list.listIterator();
		System.out.println(i.nextIndex());
		System.out.println(i.previousIndex());
		System.out.println("Forward");
		while(i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println(i.nextIndex());
		System.out.println(i.previousIndex());
		System.out.println("Reverse");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
			
		}
		i.remove();
		System.out.println("After Removing");
		while(i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("index");
		int q=i.nextIndex();
		System.out.println(q);
		
		
		
		
		
		

	}

}
