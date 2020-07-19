//WAJP to find max of no.
class Max
{
	public static void main(String args[])
	{
		int[] no ={1,2,3,4};
		int max=maxim(no);
		System.out.println("the highest no is"+max);
	}
	public static int maxim(int[] no)
	{
		int max=no[0];
		for(int x : no)
		{
			if(x>max)
				max=x;
		}
		return max;
	}
}