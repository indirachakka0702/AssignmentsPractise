package Serializable;

import java.lang.reflect.Method;

// Reflection API
public class ReflectionDemo 
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("com.indu.Test");
				 Test t =(Test) c.newInstance();
				 
				 Method m = c.getDeclaredMethod("show", null);
				 m.setAccessible(true);
				 m.invoke(t, null);
				 
	}

}
