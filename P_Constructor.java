// in parameterized constructor we can initialized when the object is created
// we also have to make our own default constructor because java will not provide it's own
class Student
{
	private double mathmarks;
	Student()
	{
		mathmarks=96.0;
	}
	Student(double m)
	{
		mathmarks=m;
	}
	public double getMarks()
	{
		return mathmarks;
	}
}
class P_Constructor
{
	public static void main(String args[])
	{
		Student s1=new Student(98.0);
		Student s2=new Student(90.0);
		System.out.println("the marks of student1 is"+ s1.getMarks());
		System.out.println("the marks of student2 is"+ s2.getMarks());
	}
}