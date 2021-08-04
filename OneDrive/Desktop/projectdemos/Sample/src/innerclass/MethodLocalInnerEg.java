package innerclass;
class One{
	public void show()
	{
		 String s="preethi";
		System.out.println("Method of outer class");
		final class Two{
			public void display() {
				System.out.println("inner class within outer method"+s);
			}
		}
			Two two =new Two();
			two.display();
		}
			
		
	}
	

public class MethodLocalInnerEg {

	public static void main(String[] args) {
		One one=new One();
		one.show();

	}

}
