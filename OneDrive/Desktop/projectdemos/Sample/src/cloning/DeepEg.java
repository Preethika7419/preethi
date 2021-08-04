package cloning;

class Subject implements Cloneable{
	String s1;
	String s2;
	 Subject(String s1, String s2) {
		
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public String toString() {
		return "Subject [s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
class Student implements Cloneable{
	Subject sub;
	String studentname;
	int sid;
	 Student( String studentname, int sid,Subject sub) {
		
		this.sub = sub;
		this.studentname = studentname;
		this.sid = sid;
	}
	 protected Object clone() throws CloneNotSupportedException{
			
		 
		 Student stud= (Student)super.clone();
		 stud.sub=(Subject)sub.clone();
		 return stud;
		 
		}
		
	 
	
}
public class DeepEg  {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Subject sub=new Subject("java","Spring");
	Student stud=new Student("preethi",12,sub);
	Student stud1=(Student)stud.clone();
	System.out.println("Student1");
	System.out.println(stud.sid+stud.studentname+stud.sub);
	System.out.println(stud.sub.s1+stud.sub.s2);
	System.out.println("Student2");
	System.out.println(stud1.sid+stud1.studentname+stud1.sub);
	System.out.println(stud1.sub.s1+stud1.sub.s2);
	stud1.sub.s2="C++";
	System.out.println("Student1");
	System.out.println(stud.sid+stud.studentname+stud.sub);
	System.out.println(stud.sub.s1+stud.sub.s2);
	System.out.println("Student2");
	System.out.println(stud1.sid+stud1.studentname+stud1.sub);
	System.out.println(stud1.sub.s1+stud1.sub.s2);
	}

}
