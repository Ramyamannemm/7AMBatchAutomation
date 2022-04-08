package Package1;

public class HDFCBank implements RBIBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // RBIBank.currency="American dollars";
		
		HDFCBank bank=new HDFCBank();
		
		
	}

	@Override
	public void noOfcustomers() {
		// TODO Auto-generated method stub
		System.out.println("no of cust in hdfc bank ar 2000");
	}

	@Override
	public void RateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("the roi in hdfc bank is 10%");
	}

}
