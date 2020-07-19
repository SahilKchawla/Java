//WAJP to accept a no from user using cmd and display whether no is even or odd.
class Even_Odd
{
	public static void main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+"is odd");
	}
}