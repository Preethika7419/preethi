package cursor;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumIter {

	public static void main(String[] args) {
		Vector<String> day = new Vector();
        day.add("Sunday");
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        day.add("Friday");
        day.add("Saturday");
        Enumeration e= day.elements();
        
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
  

	}

}
