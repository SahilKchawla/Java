//WAJP to find max of no.
class Factorial
{
	public static void main(String args[])
	{
		int n,fact=1;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+n+" is "+fact);
	}
}