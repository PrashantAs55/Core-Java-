package Questions;

public class SumofArray
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,4,5,9};
		int sum = 0;
		for(int i =0; i<=a.length-1;i++)
		{
		sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
