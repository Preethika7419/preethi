package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurEg {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();

    
    m.put(100, "Apple");
    m.put(101, "Orange");
    m.put(102, "Mango");

    
    m.putIfAbsent(101, "Hello");

   
    m.remove(101, "Banana");

  
    m.putIfAbsent(103, "Papaya");

   
    m.replace(101, "Hello", "For");
    System.out.println(m);
    Iterator<ConcurrentHashMap.Entry<Integer, String> >
    itr = m.entrySet().iterator();
    while (itr.hasNext()) {
    ConcurrentHashMap.Entry<Integer, String> entry
        = itr.next();
    System.out.println("Key = " + entry.getKey()
                       + ", Value = "
                       + entry.getValue());

   
	

}
    System.out.println("The Value associated to "
            + "103 is : " + m.get(103));
    
    System.out.println(m.contains("papaya"));
    System.out.println(m.containsKey(109));
    System.out.println(m.containsValue("Papaya"));
    System.out.println(m.entrySet());
    System.out.println(m.equals(m));
    
    System.out.println(m.keySet());
    System.out.println(m.mappingCount());
    System.out.println(m.values());
	}
}
