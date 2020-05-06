package stringPractice;

public class CopyOfAnObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
	     Bcd obj=new Bcd();
	     obj.i=5;
	     obj.j=6;
	    // Bcd obj1=obj;    -> Shallow copy 
	     // obj1.j=8;    -> shallow copy
	     /*Bcd obj1=new Bcd();
	     obj1.i=obj.i;    -> Deep copy
	       obj1.j=obj.j;    ->Deep copy
	       obj1.j=8;         -> Deep copy */
	     
	     Bcd obj1= (Bcd) obj.clone();   // Clone copy
	     obj1.j=8;          // clone copy
	     System.out.println(obj1);
	     System.out.println(obj);
    
	}

}

class Bcd implements Cloneable
{
	int i,j;

	@Override
	public String toString() {
		return "Bcd [i=" + i + ", j=" + j + "]";
	}
	@Override
     public Object clone()throws CloneNotSupportedException
     {
    	 return super.clone();
     }
	
}