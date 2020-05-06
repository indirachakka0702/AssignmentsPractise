package collectionandGenerics;

import java.util.ArrayList;

class Container<T extends Number>    // T is a type of an element
	{
		T value;                    // we write extends Number then it won't allow string any thing
		
		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public void show()
		{
			System.out.println(value.getClass().getName());
		}
		public void Demo(ArrayList<? extends T>obj)
		{
			
		}
	}
	public class GenericsDemo {
	public static void main(String[] args) 
	{
	   	Container<Integer> obj = new Container<>();  // we can use class only not the int,chat we need to write integer
	   	obj.value = 9;                   
	   	obj.show();
	   	obj.Demo(new ArrayList<Integer>());

	}

}
