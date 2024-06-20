package basic;

public class for_loopEven {

	public static void main(String args[])
	{
		int a[]= {1,6,5,9,4,7,3};
		System.out.println("For loop = ");
		for(int j = 0 ; j< a.length; j++)
		{
			if(a[j]%2==0)
			{
				System.out.println(a[j]);
			}
		}
	}

}
