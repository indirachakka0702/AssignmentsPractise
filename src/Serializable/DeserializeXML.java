package Serializable;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializeXML {

	public static void main(String[] args)
	{
	
       try {
		           XMLDecoder x=new XMLDecoder(new BufferedInputStream(new FileInputStream("MyCollege.XML")));
		           
		           College c= (College)x.readObject();
		           List<Student> s = c.getStudents();
		           
		           for(Student value : s)
		           {
		        	   System.out.println(value);
		           }
	        }
       catch (FileNotFoundException e)
           {
		     // TODO Auto-generated catch block
		      e.printStackTrace();
	       }
	}

}
