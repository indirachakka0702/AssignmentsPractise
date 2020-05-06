package stringPractice;

public class ExceptionHandlingWithChecked {

	public static void main(String[] args)
	{
		int i,j,k=0;
		int a[]=new int [4];
		i=8;j=2;
		try
		{
			k=i/j;
			for(int c=0;c<=4;c++)
			{
				a[c]=c+1;
			}
			for(int value:a)
			{
				System.out.println(value);
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divided by Zero" + e);
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.out.println("Maximum number of values is 4");
		}
		catch(Exception e)     // if you don't know what type of exception it is then write this
		{
			System.out.println("Unknown Exception");
		}
		System.out.println(k);	

	}

}
