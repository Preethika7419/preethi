package exception;

public class Eg3 {
	
	   public static void main(String args[]) {
	      try{  
		 int num=121/10;  
		 System.out.println(num);  
	      }  
	      catch(Exception e){
	         System.out.println("Number should not be divided by zero");
	      }  
	     
	      finally{
		 System.out.println("This is finally block");
	      }  
	      System.out.println("Out of try-catch-finally");  
	   }   
	}

