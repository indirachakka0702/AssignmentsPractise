package stringPractice;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileInJava {

	public static void main(String[] args) throws Exception
	{
	   Properties p = new Properties();	
      OutputStream os = new FileOutputStream("dataConfig.properties");
         p.setProperty("url","localhost:3306/myDb");
         p.setProperty("uname","Indu");
         p.setProperty("pass", "1234");
         
         p.store(os, null );
	}

}
