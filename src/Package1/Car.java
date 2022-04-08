package Package1;

public class Car {

	private int seatbelt=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car parent=new Car(); //object creation,created in heap memory
		
		
	}
	
	public Swiftdesire engine()
	{
		System.out.println("car class engine");
		return new Swiftdesire();
	}
	
	public void noofwheels()
	{
		System.out.println("car class wheels method");
	}

}
