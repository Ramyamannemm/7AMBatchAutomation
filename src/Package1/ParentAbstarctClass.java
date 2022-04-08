package Package1;

public abstract class ParentAbstarctClass {
  
	 String name="Ramya"; //it is not by default public static final
	
	//abstarct and also non abstarct methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public abstract void method1();
	
	public void method2()   //instance method
	{
		System.out.println("this is simple instance mthod");
	}
	
	public static void method3()
	{
		System.out.println("This is a static method");
	}

}
