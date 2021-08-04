package innerclass;
class Preethi{
	void sho() {
		System.out.println("First class");
	}
}
public class AnonymousEg {
	
	static Preethi pre=new Preethi() {
	void sho() {
		super.sho();
		System.out.println("Anonymous class");
		
	}
	};
	

	public static void main(String[] args) {
		pre.sho();
		

	}

}
