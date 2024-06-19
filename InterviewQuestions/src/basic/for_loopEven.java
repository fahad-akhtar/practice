package basic;

public class for_loopEven {

	public static void main(String args[])
	{
		int a[]= {1,6,5,9,4,7,3};
		System.out.println("For loop = ");
		for(int i = 0 ; i< a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
