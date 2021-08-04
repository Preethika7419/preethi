package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapiteration {
	public static void main(String [] args) {
	HashMap<Integer,String> hmap=new HashMap<Integer , String>();
	hmap.put(1,"Preethi");
	hmap.put(2,"pooja");
	
	Set s=hmap.entrySet();
	Iterator iterator= s.iterator();
	while(iterator.hasNext()) {
		Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
		System.out.println(entry.getKey()+entry.getValue());
		
	}
	
	
	
	}
	

}
