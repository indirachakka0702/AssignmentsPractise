package stringPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// try with resource java 1.7 and after

public class ExceptionHandlingTryWithResources {

	public static void main(String[] args) throws Exception
	{
		/*BufferedReader br=null;
		try
		{
		    String str="";
	        br= new BufferedReader(new InputStreamReader(System.in));	
            str= br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
            br.close();
		}   */
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
		{
			String str="";
			str=br.readLine();
			System.out.println(str);
		}    
		// try with resources works to close and catch the resources
	}

}
