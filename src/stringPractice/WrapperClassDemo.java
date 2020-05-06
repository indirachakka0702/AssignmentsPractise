package stringPractice;

import java.util.ArrayList;

// Wrapper class
// java 99.9% object oriented
// int,float,double,char  -> primitive values
// Integer,Float,Double,Character   -> classes
public class WrapperClassDemo {

	public static void main(String[] args) throws Exception 
	{
	     int i=5;
	     Integer ii=new Integer(i);    // Boxing..
	     Integer jj=i;      // Autoboxing
	     
	     int j= jj.intValue();    // Unboxing
	     int k=jj;         // AutoUnboxing
	     
	     ArrayList<Integer> values= new ArrayList<Integer>();
          values.add(5);
          values.add(7);
	}

}
