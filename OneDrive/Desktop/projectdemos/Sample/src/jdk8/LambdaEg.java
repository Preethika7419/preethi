package jdk8;
interface calculate {
	public int area(int a,int b);
	
}
public class LambdaEg {

	public static void main(String[] args) {
		 calculate c=(a,b)->{
			System.out.println("Area"+a*b);
			return a*b;
		};
		c.area(2, 5);
		

	}

}
