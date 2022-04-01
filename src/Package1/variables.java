package Package1;

public class variables {
	
	String collegename="VNR";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=20;  //primitive variable
		variables var=new variables();  //var is called refrence variable
		
		
		System.out.println(var.collegename);
		
		System.out.println(Student.collegename);
		
		Student student1=new Student();
		System.out.println(student1.rollno);
		
		
	}

}
