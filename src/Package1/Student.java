package Package1;

public class Student {
	
    static String collegename="VNR"; //static variable
    int rollno=1; //instance variable
	
	
	public static void main(String[] args) {
		final int age = 0; //local variable
		// TODO Auto-generated method stub
		System.out.println(age);
		Student Suresh=new Student();
		Suresh.rollno=2;
		Suresh.collegename="JNTU";
		System.out.println("Suresh rollno" + Suresh.rollno);
		System.out.println("Suresh college " + collegename);
		
		
		
		Student Ramesh=new Student();
		
		System.out.println("Ramesh rollno"+ Ramesh.rollno);
		System.out.println("Ramesh college" + Ramesh.collegename);
		

	}
	
	
	public void method()
	{
		String name = "Ramya"; //local var
		System.out.println(name);
		
		
	}

}
