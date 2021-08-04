package cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SyncEg {

	public static void main(String[] args) {
		List<String> day = new ArrayList<>();
        day.add("Sunday");
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        day.add("Friday");
        day.add("Saturday");
        System.out.println(day);
        
        List<String> sync= Collections.synchronizedList(day);
        System.out.println(sync);
        
        
        Set<Integer> s=new HashSet<>();
        s.add(23);
    
        Collections.addAll(s, 34,35,67,98,21,75);
        System.out.println(s);
        Set<Integer> s1=Collections.synchronizedSet(s);
        System.out.println(s1);
        

	}

}
