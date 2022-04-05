package Package1;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Overloading overload=new Overloading();
		System.out.println(sum());
		System.out.println(sum(3,4));
		overload.sum(4);
		
	}
	
	
	public static int sum()
	{
		int a=1;
		int b=2;
		return a+b;
	}
	
	public static int sum(int a,int b)
	{
		return a+b;
		
	}
	
	public void sum(int a)
	{
		int b=5;
		System.out.println(a+b);
	}

}
