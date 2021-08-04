package innerclass;
interface Anony{
	void dis();
}
public class AnonymousEg2 {
	
	static Anony an=new Anony() {
		public void dis() {
			System.out.println("Anonymous class");
		}
		
	};
	

	public static void main(String[] args) {
		an.dis();

	}

}
