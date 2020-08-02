// a constructor that takes object of class as a parameter.
class Student
{
	private String name;
	private int roll;
	private int marks;
	Student()
	{
		name="Khushi";
		roll=04;
		marks=100;
	}
	Student(String n, int r,int m)
	{
		name=n;
		roll=r;
		marks=m;
	}
	Student(Student p)
	{
		name=p.name;
		roll=p.roll;
		marks=p.marks;
	}
	public void Display()
	{
		System .out.println("the name of student is "+name);
		System .out.println("the roll no of student is "+roll);
		System .out.println("the marks of student is "+marks+" \n ");
	}
}
class Constructor_Params
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student("sahil",04,100);
		Student s3=new Student(s1);
		s1.Display();
		s2.Display();
		s3.Display();
	}
}