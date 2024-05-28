package Questions;

public class PerfectNum 
{
public static void main(String[] args) {
	int no =6;
	int sum =0;
	for(int i= 1;i<no;i++)
	{
		if(no%i==0)
		{
			sum =sum+i;
			
		}
	}
		if(no == sum)
		{
			System.out.println("Its is a perfect number");
		}
		else 
		{
			System.out.println("Its is  not a perfect number");
		}
	}
}
