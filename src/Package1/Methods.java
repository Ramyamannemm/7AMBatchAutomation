package Package1;

public class Methods {

	public static void main(String [] args)
	
	{
		//add to cart feature and payment feature
		Methods method=new Methods();
		method.payment();
		System.out.println(Methods.addtocart());
	}
	
	public static int addtocart()
	{
		System.out.println("this is add to cart feature");
		int noofitems=20;
		return noofitems;
	}
	
	public void payment()
	{
		System.out.println("this is payment feature");
	}
	
	
	
}
