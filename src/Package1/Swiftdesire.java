package Package1;

public class Swiftdesire extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Swiftdesire swift=new Swiftdesire(); //child class object reference
       // swift.engine();
       // swift.noofwheels();
        
        Car car=new Car(); //parent class object ref
      //  car.autodriving(); //this is not possible
       // car.engine();
       // car.noofwheels();
        
        Car car1=new Swiftdesire(); //overriding or runtime polymorphysim or dynamic binding
        car1.engine();
        //car1.noofwheels();
        
        
      //  Swiftdesire desire=new Car(); //this is not a possible case
        
        
	}
	
	public void autodriving() {
		System.out.println("swift desire autodriving method");
	}
	public Swiftdesire engine()
	{
		System.out.println("child class engine method");
		return new Swiftdesire();
	}

}
