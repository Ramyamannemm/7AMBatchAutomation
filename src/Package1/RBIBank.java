package Package1;

public interface RBIBank {

	
	//abstract , default, static methods
	//variables
	
	 String currency="Indian Rupees"; //by default public, static and final
	
	public void noOfcustomers(); //by default this is an abstract method
	public void RateOfInterest();
	
	default void method()      //Java version 8
	{
		System.out.println("this is a default method");
	}
	
	
	public static void method2()
	{
		System.out.println("thsi is a static method");
	}
	
	
}
