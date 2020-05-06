package stringPractice;

public class StringToString {

	public static void main(String[] args)
	{
		student s1=new student(11,"Indu");
		System.out.println(s1);

	}

}
 class student
 {
	 int rollnumber;
	 String studentname;
	 
	public student(int rollnumber, String studentname) {
		super();
		this.rollnumber = rollnumber;
		this.studentname = studentname;
	}
	/*public String toString()
	{
		return rollnumber + ":"+ studentname;
	}*/

	@Override
	public String toString() {
		return "student [rollnumber=" + rollnumber + ", studentname=" + studentname + "]";
	}

	
	
 }