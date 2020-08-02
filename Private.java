// use of private 
class Student
{
	private double mathmarks;
	public void setMarks(double m)
	{
		mathmarks=m;
	}
	public double getMarks()
	{
		return mathmarks;
	}
}
class Private
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setMarks(98.0);
		System.out.println("the marks of 1st student is "+s1.getMarks());
		// in this a default constructor is called for s2;
		System.out.println("the marks of 1st student is "+s2.getMarks());
	}
}