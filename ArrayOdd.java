package Questions;

public class ArrayOdd {
public static void main(String[] args) {
	int [] a = {8,4,2,3};
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2 == 1)
			System.out.println(i+" "+a[i]);
	}
}
}