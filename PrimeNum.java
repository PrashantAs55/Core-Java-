package Questions;

public class PrimeNum 
{
	public static void main(String[] args) {
		int no = 123;
		int count = 0;
		
		for(int i = 1; i<=no;i++)
		{
			if(no%i == 0)
				count++;
			}
			if(count == 2)
			{
				System.out.println(no+ " No is prime number");
				
			}
			
			else
			{
				System.out.println(no+ " Not is prime number");
				
			}
		}
	} 