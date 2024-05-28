package Questions;

public class ArmStrong 
{
	public static void main(String[] args) 
	{
		int no = 123;
		int sum = 0;
		int copy = no;
		while(no!=0)
		{
			int rem = no%10;
			sum = sum+(rem*rem*rem);
			no = no/10;
			
		}
		if(sum == copy)
		{
			System.out.println(copy +" its a arm strong number");
		}
		else 
		{
			System.out.println(copy +" it not a arm strong number");
		}
		
	}
}
