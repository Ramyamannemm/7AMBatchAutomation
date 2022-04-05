package Package1;

public class Swiftdesire extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        engine();
        Swiftdesire swift=new Swiftdesire(); //child class object reference
        
        swift.noofwheels();
        
        Car car=new Car(); //parent class object ref
      //  car.autodriving(); //this is not possible
        car.engine();
        car.noofwheels();
        
        
	}
	
	public void autodriving() {
		System.out.println("swift desire autodriving method");
	}

}
