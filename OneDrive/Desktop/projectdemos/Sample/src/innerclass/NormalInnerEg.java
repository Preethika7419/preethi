package innerclass;

class demo1{
	int x=2,y=3;
	class demo2{
		public void display(int w,int q) {
			System.out.println(w*q);
			System.out.println(x*y);
		}
	}
}

public class NormalInnerEg {

	public static void main(String[] args) {
		demo1.demo2 demo=new demo1().new demo2();
		demo.display(2,3);

	}

}
