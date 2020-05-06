package collectionandGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args)throws Exception
	{
	
		  List<Integer> values = new ArrayList<Integer>();
		  values.add(3);
		  values.add(77);
		  values.add(55);
		  values.add(2);
		  values.add(10);
		  
		  Collections.sort(values);
		  values.forEach(System.out::println);   // Stream API..which uses Lambda Expression introduced in java 1.8

	}

}
