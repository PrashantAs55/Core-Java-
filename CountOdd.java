package Questions;

public class CountOdd 
{
	public static void main(String[] args) 
	{
		int no =123;
		int count = 0;
		while(no!=0)
		{
			int rem = no%10;
			
			if(rem%2 == 1)
			{
				count++;
			}
			no = no/10;
		}
		System.out.println(count);
	}
}
