class Box
{
	double h;
	double w;
	double l;
}
class Boxd2
{
	public static void main(String args[])
	{
		Box mybox1=new Box();
		Box mybox2=new Box();
		mybox1.h=10.0;
		mybox1.w=20.0;
		mybox1.l=30.0;
		mybox2.h=40.0;
		mybox2.w=20.0;
		mybox2.l=30.0;
		double vol1,vol2;
		vol1=mybox1.h*mybox1.w*mybox1.l;
		vol2=mybox2.h*mybox2.w*mybox2.l;
		System.out.println("the vol of first box is"+ vol1);
		System.out.println("the vol of second box is"+ vol2);
	}
}