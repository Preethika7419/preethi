class Students
{
	String name;
	int rollno;
	 Students(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}
	 public boolean equals(Object obj)
	 {
		 try {
		
		 Students s=(Students)obj;
		 
		 		 if(name.equals(s.name)&& rollno==s.rollno)
			 return true;
		 else
			 return false;
		 }
		 catch(ClassCastException e) {
			 return false;
		 }
		 catch(NullPointerException e) {
			 return false;
		 }
	 }
	
}
public class EqualsEg {

	public static void main(String[] args) {
		Students s1=new Students("preethi",1);
		Students s2=new Students("priya",2);

		Students s3=new Students("preethi",1);

		Students s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("preethi"));
		System.out.println(s1.equals(null));
		
		

		

	}

}
