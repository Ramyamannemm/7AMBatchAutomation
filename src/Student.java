
public class Student {
	
    static String collegename="VNR"; //static variable
    int rollno=1; //instance variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Suresh=new Student();
		Suresh.rollno=2;
		Suresh.collegename="JNTU";
		System.out.println("Suresh rollno" + Suresh.rollno);
		System.out.println("Suresh college " + collegename);
		
		
		
		Student Ramesh=new Student();
		
		System.out.println("Ramesh rollno"+ Ramesh.rollno);
		System.out.println("Ramesh college" + Ramesh.collegename);
		

	}

}
