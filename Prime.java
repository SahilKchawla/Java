//WAJP to check whether no is prime or not using cmd.
class Prime
{
	public static void main(String args[])
	{
		int n,i;
		n=Integer.parseInt(args[0]);
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+"is not prime");
				break;
			}
			else
			{
				System.out.println(n+" is prime");
				break;
			}
		}
	}
}