package stringPractice;

public class ExceptionHandlingUserDefinedException {

	public static void main(String[] args) 
	{
		int i=1;
		try
		{
			if(i<10)
			{
				throw new MyException("Errorrrr");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}