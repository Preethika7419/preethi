package exception;
import java.util.Scanner;

public class MulticatchEg {
	
	
	
	    public static void main(String args[])
	    {
	       int x=0;
	        try
	        {
	            
	            if (99%x == 0)
	                System.out.println(x + " is a factor of 99");
	            else
	            	System.out.println("Not a factor");
	        }
	        catch (NumberFormatException  | ArithmeticException ex)
	        {
	            System.out.println("Exception encountered " + ex);
	        }
//	        catch(ArithmeticException e) {
//	        	System.out.println("Exception");
//	        }
	       
	}
}


