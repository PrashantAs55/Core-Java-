package Questions;

public class ArrayIndexOdd 
{
	public static void main(String[] args) {
		int[] ab = {1,2,3,4,5};
		{
			for (int i = 0; i < ab.length; i++) {
			if(i%2 == 0)
			{
				System.out.println(ab[i]);
			}
			}
		}
	}
}
