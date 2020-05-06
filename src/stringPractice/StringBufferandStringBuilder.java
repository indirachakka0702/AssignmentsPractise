package stringPractice;

public class StringBufferandStringBuilder {

 public static void main(String[] args) 
	{
	    StringBuffer sbf=new StringBuffer("Navin");
	    sbf.append(" Reddy");// to combine two strings
	    sbf.replace(0, 5,"kiran"); // to replace the name
	    sbf.reverse();   // to reverse the string
	   
	    System.out.println(sbf);

	}

}
