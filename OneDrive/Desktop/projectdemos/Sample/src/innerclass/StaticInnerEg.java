package innerclass;
class StaticInnerEg{
	public static void outermtd() {
		System.out.println("Outer class method");
	}
	
		static class  Outerclass{

			public static void main(String[] args) {
				System.out.println("Inner class ");
				outermtd();

			}

		}
	}
	



