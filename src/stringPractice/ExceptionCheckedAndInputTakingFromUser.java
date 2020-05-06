package stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExceptionCheckedAndInputTakingFromUser {

	public static void main(String[] args) 
	{
	   int i,j=1,k=0;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          i=8;  
          try
          {
        	  System.out.println("Enter a number");
        	  j=Integer.parseInt(br.readLine());
        	  k=i/j;
        	  System.out.println("Output is: "+k);
        	  //System.out.println("Bye");
          }
          catch(IOException e)
          {
        	  System.out.println("Some IO Error");
          }
          catch(ArithmeticException e)
          {
        	  System.out.println("cannot divided by zero" + e);
          }
          catch(Exception e)
          {
        	  System.out.println("Unknown Excxeption");
          }
          finally
          {
        	  System.out.println("Finally Bye");
          }
         //  System.out.println(k);
	}

}
