package stringPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingThrowsAndThrows {

	public static void main(String[] args) throws Exception // we are not handling the error we are supress the error 
	{
		int i,j=1,k=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		i=8;
		try
		{
		    System.out.println("Enter the number");
		    j=Integer.parseInt(br.readLine());
		    k=i+j;
		    if(k<10)
		    {
			    throw new ArithmeticException();
		     }
		      System.out.println("Output is: "+k);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Minimum value for the output is 10");
		}
        finally
        {
        	System.out.println( "Finally bye");
        }
	}

}
