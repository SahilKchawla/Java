// when we have to return object 
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
	Student greater_Marks(Student p)
	{
		if(this.marks>p.marks)
			return this;
		else
			return p;
	}
	public String getName()
	{
		return name;
	}
}
class Cons_return_Obj
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student("sahil",04,98);
		Student s3=new Student(s1);
		s1.Display();
		s2.Display();
		s3.Display();
		Student g=s1.greater_Marks(s2);
		System.out.println("marks of student "+g.getName()+" is greater");
		Student k=s2.greater_Marks(s3);
		System.out.println("marks of student "+g.getName()+" is greater");
	}
}