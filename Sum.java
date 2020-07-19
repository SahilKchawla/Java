//WAJP to accept three no.s and display their sum.
class Sum
{
	public static void main(String args[])
	{
		int i,n=3,sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("the sum is "+sum);
	}
}