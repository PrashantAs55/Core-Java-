package Questions;

public class Atm_class 
{
	public static void main(String[] args)
	{
		EncapsulationExample2 e = new EncapsulationExample2();
				System.out.println(e.get_atm_pin());
				e.set_atm_pin(2345);
				System.out.println(e.get_atm_pin());
	}
}
