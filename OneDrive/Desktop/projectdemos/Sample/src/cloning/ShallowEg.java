package cloning;

class Course {
	String c1;
	String c2;
	String c3;
	public Course(String c1, String c2, String c3) {
		
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	@Override
	public String toString() {
		return "Course [c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
	}
	
}
class Learner implements Cloneable{
	Course course;
	
	String name;
	int id;
	
	public Learner(String name, int id,Course course ) {
		
		this.course = course;
		this.name = name;
		this.id = id;
	}
	
	
	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();
				 
	 }
	
	
}
public class ShallowEg {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course=new Course("Java","Python","SpringBoot");
		Learner l=new Learner("Preethi",233,course);
		Learner l1=(Learner)l.clone();
		System.out.println("Learner1");
		System.out.println(l.id+l.name+l.course);
		System.out.println(l.course.c1+l.course.c2+l.course.c3);
		System.out.println("Learner2");
		System.out.println(l1.id+l1.name+l1.course);
		System.out.println(l1.course.c1+l1.course.c2+l1.course.c3);
		l1.course.c1="C++";
		System.out.println("Learner1");
		System.out.println(l.id+l.name+l.course);
		System.out.println(l.course.c1+l.course.c2+l.course.c3);
		System.out.println("Learner2");
		System.out.println(l1.id+l1.name+l1.course);
		System.out.println(l1.course.c1+l1.course.c2+l1.course.c3);
		
	

	}

	

}
