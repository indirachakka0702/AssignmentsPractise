package stringPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// BufferedReader
// Scanner
public class UserInput {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the number");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
         System.out.println(n);
	}

}
