package stringPractice;

import java.util.Scanner;

public class StringcreationConcatenation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		String s3=s1.concat(s2);   //s3=s1+s2;
		System.out.println("Concatination of two strings is: "+s3);
		
		s1= s1.toUpperCase();
		System.out.println("Upper case of the first string: "+s1);
	}

}
