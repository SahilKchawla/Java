class Box
{
	double h;
	double w;
	double l;
}
class Boxd
{
	public static void main(String args[])
	{
		Box mybox =new Box();
		double vol;
		mybox.w=10.0;
		mybox.h=20.0;
		mybox.l=30.0;
		vol=mybox.l*mybox.h*mybox.w;
		System.out.println("the vol of box is"+vol);
	}
}