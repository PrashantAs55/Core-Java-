package Questions;

public class Customer 
{
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.get_food_name());
		e.set_food_name("Dosa");
		System.out.println(e.get_food_name());
	}
}
