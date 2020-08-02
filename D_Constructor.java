class Student
{
	private double mathmarks;
	Student()
	{
		mathmarks=95.0;
	}
	public void setMarks(double m)
	{
		mathmarks=m;
	}
	public double getMarks()
	{
		return mathmarks;
	}
}
class D_Constructor
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setMarks(98.0);
		System.out.println("the marks of student 1 is"+s1.getMarks());
		System.out.println("the marks of student 2 is"+s2.getMarks());
	}
}