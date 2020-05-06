package collectionandGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 1.0 java
//1.2 Collection and 
// 1.5 Generics
// Dynamic Array - Collection
// two methods to fetching elements 
// 1. Iterator
// 2. Enhanced for loop
public class DemoCollection {

	public static void main(String[] args)throws Exception
	{
	/*	int values[] = new int [4]; // here we and fixing the elements type is integer
		Object values1[] = new Object[4];// here we not fixing the object type
		 values1[0] = "Nain";
		 values1[1] = 3;      */
		
		Collection<Integer> values = new ArrayList<>();  // we are not fixing the size of an elements
		   values.add(3);       // here add is a method to add the elements to an array
		 //  values.add("Navin"); // we are getting error because we mention the type of elements
		   //values.add(5.8f);
		   values.add(77);   // we can add the element also
		   values.add(85);
		   values.add(9); // we can't add the element between the elements due to it won't support index numbers
		   values.remove(77); // we can remove an element
	/*	   Iterator i= values.iterator();
		   while(i.hasNext())     // hasNext is method to fetch values
		   {
			   System.out.println(i.next());
		   }    */
		
		 for(Integer i  : values)   // we can write int or Integer or object
		 {
			 System.out.println(i);
		 }
		
	}

}
