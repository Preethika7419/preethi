class Student{
	int sno;
	String sname;
	Student(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
	}
	
	//overriding tostring to return our object.
	//otherwise it will return the tostring method syntax.
	public String toString() {
		return "Sno:"+sno+"sname:"+sname;
	}
}
 class ToStringEg
 {
	public static void main(String args[])
	{
		Student s1=new Student(1,"Preethi");
		System.out.println(s1);
	}

}

