package string;

public class StringDemo {
	public static void main(String []args) {
		String s="Bluemoon";
		String s1=new String("Sunrise");
		char charray[]= {'s','t','a','r'};
		String str="Sun and Moon are glimpse";
		String q=new String("Happy");
		String q1=new String("Happy");
		
		String eq="Equals";
		String eq1="Equals";
		String str1= new String("Apple");
		String str2= new String("MANGO");
		String str3= new String("APPLE");
		
		//converting char to string
		String s2=new String(charray);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		//methods of string
		
		
		
//		//charAT
		char ch=str.charAt(5);
		System.out.println("character at index: "+ch);
		//to print literals one by one
		for(int i=0; i<=s.length()-1; i++) {
			System.out.println(s.charAt(i));
		}
		//exception
		try {
		System.out.println("exception"+str.charAt(34));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index is out of Bound");
		}
		
		
//		//equals
		
		//comparing object created using new keyword
		if(q==q1)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		//without new keyword
		if(eq==eq1)
			System.out.println("Both are equal");
		else
			System.out.println("Both ae not equal");
		System.out.println("Comparing using .equals()");
		System.out.println(eq.equals(eq1));
		
		
//		//equalsignorecase
		
		System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
		System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
		System.out.println("str1 equals to Welcome:"+str1.equalsIgnoreCase("Welcome"));
		System.out.println("str1 equals to Apple:"+str1.equalsIgnoreCase("Apple"));
		System.out.println("str2 equals to mango:"+str2.equalsIgnoreCase("mango"));
		
//		//compare to
		//each character is converted to unicode.
		//returns 0 if equal
		System.out.println(str1.compareTo(str2));
		System.out.println(q.compareTo(q1));
		//comparetoignore case
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));
		
//		//indexof
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 8));
		
//		//susstring
		System.out.println(str.substring(6));
		System.out.println(str.substring(4, 13));
		
//		//concat
		System.out.println(str1.concat(" juice"));
		str2=str2.concat("juice");
		System.out.println(str2);
		str3=str3.concat(str2);
		System.out.println(str3);
		
//     //replace
		System.out.println(str3.replace('A', 'O'));
		System.out.println(str.replace("Sun", "Jupiter"));
		
		//uppercase
		System.out.println(str3.toLowerCase());
		
		//lowercase
		System.out.println(str.toUpperCase());
		
		
		//contains
		System.out.println(str.contains("Sun"));
		
		//isempty
		String cat=null;
		String dog=" ";
		try {
			System.out.println(cat.isEmpty());
		} catch (Exception e) {
			System.out.println("Null String");
		}
		System.out.println(dog.isEmpty());
		
		
		//length
		
		System.out.println(str.length());
		
	}

}
