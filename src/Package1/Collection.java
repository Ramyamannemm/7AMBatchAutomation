package Package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=new ArrayList<Integer>(); //run time polymorpyhism
		List<Integer> list1=new LinkedList<Integer>();
		Vector <Integer> vector=new Vector<Integer>(); //by defl
		
		list.add(11);
		list.add(12);
		
		list1.add(13);
		list1.add(14);
		
		list.addAll(0,list1);

		list.remove(12);
		
       // list.set(0, 11); // to update the value of some element 
        
      //  list.clear(); //clear all the elements from the list
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
		
		Set<String> set=new HashSet();
		
		set.add("Ramya");
		set.add("Ramya");
		System.out.println(set);
		
	}

}
