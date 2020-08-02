class Student
{
	int r,n;
	String name;
	Student()
	{
		r=02;
		n=96;
		name="sahil";
	}
	Student(int roll,int mrks,String N)
	{
		r=roll;
		n=mrks;
		name=N;
	}
	public void Display()
	{
		System.out.println("name of student is "+ name);
		System.out.println("roll no of student is "+ r);
		System.out.println("marks of student is "+ n +"\n");
	}
}
class Constructor_OverLoading
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student(04,100,"khushi");
		s1.Display();
		s2.Display();
	}
}