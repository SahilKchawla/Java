//WAJP to take marks out of 500 and display %.
class Percentage
{
	public static void main(String args[])
	{
		double marks;
		int n;
		n=Integer.parseInt(args[0]);
		marks=(n/500.0)*100;
		System.out.println("the percentage is"+marks);
	}
}