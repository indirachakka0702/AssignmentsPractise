package stringPractice;

public class StringSplittingfromCVS {

	public static void main(String[] args)
	{
	     String str="Navin,Praveen,Kiran,Rahul";
	      String names[]= str.split(",");
	      
	    // System.out.println(names[2]);
          
	      for(String val:names)
	    	  System.out.println(val);
	}

}
