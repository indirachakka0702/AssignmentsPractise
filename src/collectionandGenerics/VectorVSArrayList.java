package collectionandGenerics;

import java.util.ArrayList;
import java.util.Vector;

// Vector

public class VectorVSArrayList {

	public static void main(String[] args)throws Exception
	{
		//ArrayList<Integer> v= new ArrayList<>();  // 50%// Not threadsafe// fast // best one to use
	   Vector <Integer>v= new Vector<Integer>();   // 100% increase capacity waste of memory // Thread safe theoritacally // slow
	   v.add(5);
	   v.add(7);
	   v.add(6);
	   v.add(8);
	   v.add(9);
	   v.add(1);
	   v.add(3);
	   v.add(5);
	   v.add(5);
	   v.add(7);
	   v.add(6);
	   v.add(8);
	   v.add(9);
	   v.add(1);
	   v.add(3);
	   v.add(5);
	   
	   v.remove(1);
	   System.out.println(v.capacity());  
       
	   for(int i : v)
	   {
		   System.out.println(i);
	   }
	}

}
