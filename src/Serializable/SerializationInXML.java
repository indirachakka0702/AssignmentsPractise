package Serializable;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationInXML {

	public static void main(String[] args)
	{ 
		try {
			Student st1 = new Student();
	  st1.setRollno(101);
      st1.setSname("Harry");
      
      Student st2 = new Student();
	  st2.setRollno(102);
      st2.setSname("Poter");
      
      
      List<Student> s= new ArrayList<>();
      s.add(st1);
      s.add(st2);
      
      College c= new College();
      c.setStudents(s);

			
      XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollege.XML")));
      x.writeObject(c);
		x.close();
	     
				} 
		catch (FileNotFoundException e) 
		{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		     
      
	}

}
