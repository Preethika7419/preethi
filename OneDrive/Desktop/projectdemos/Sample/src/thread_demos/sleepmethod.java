package thread_demos;
class Square extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			int sq=0;
			sq=i*i;
			System.out.println("Square of "+i+" is"+sq);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
		}
	}
}
	

class Cube extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			int cu=0;
			cu=i*i*i;
			System.out.println("Cube of "+i+" is"+cu);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
		}
	}
	
}


 class sleepmethod {

	public static void main(String[] args) {
		Square obj1=new Square();
		Cube obj2=new Cube();
		obj1.start();
		obj2.start();

	}
}
 



