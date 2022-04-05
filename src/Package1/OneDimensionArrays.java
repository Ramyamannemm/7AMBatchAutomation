package Package1;

import java.util.Random;

public class OneDimensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//easily access the data
           int [] rollnoarray=new int[10]; //declare an array
           String [] schollgrups= {"Red", "yellow", "blue"}; //static initialization
           System.out.println(schollgrups.length);
           for(int i=0;i<rollnoarray.length;i++) {    //i->0->1->2->3..........9->10
        	 
        	   if(i==5)
         	  {
         		  continue;
         	  }
        	  rollnoarray[i]= Randomvalue();
        	  System.out.println(rollnoarray[i]);
        	  
        	  
        	   
        	   
           }
           
           System.out.println("came out of the for loop");
           
	}
	
	public static int Randomvalue()
	{
		Random random=new Random();
		return random.nextInt(50);
		
	}

}
