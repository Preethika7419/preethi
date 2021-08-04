import java.lang.reflect.Method;

public class GetclassEg {

	public static void main(String[] args) {
		int count=0;
		Object o=new String("preethi");
		Class c=o.getClass();
		System.out.println("Name of the class:"+c.getName());
		Method[] m= c.getDeclaredMethods();
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total methods is:"+count);
		
	}

}
