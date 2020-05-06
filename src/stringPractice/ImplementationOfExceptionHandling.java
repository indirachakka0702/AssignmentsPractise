package stringPractice;

public class ImplementationOfExceptionHandling {

	public static void main(String[] args) 
	{
	    int i,j,k=0;
	    i=8;
	    j=0 ;  //j=4;
	    
	    try
	    {
	    	k=i/j;	  //unchecked Exception
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("cannot Divided by Zero");
	    }
	    
	    System.out.println(k);

	}

}
