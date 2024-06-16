package listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleList1 {

	public static void main(String[] args) {
		 
		// arraylist,linkedlist,vector
		
		//List l2 = new LinkedList<>();
		//List l3 = new Vector<>();
		
		List l1 = new ArrayList<>(30); 
		l1.add("Priyanka");
		l1.add(30);
		l1.add(6.8);
		l1.add("1/1/2001");
		System.out.println(l1);
		
		
		List<Integer> l2 = new ArrayList<Integer>(40);
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		System.out.println(l2);
		
		
		Integer lno=new Integer(10);
		boolean b=l2.contains(lno);
		System.out.println(b);
		
		 System.out.println(l2.indexOf(lno));
	    // System.out.println(l2.lastIndexOf(lno));
	     
	     l2.remove(lno);
	     System.out.println(l2);
	
	     
	  // 1 : for each loop

			for(Object i : l1) {
				
				System.out.println(i);
				
			}
			for(int i : l2) {
				
				System.out.println(i*100);
				
			}
			
	 // 2 : iterator interface

			Iterator i =l2.iterator();
			while(i.hasNext()) {
				int r = Integer.parseInt(i.next().toString());
				System.out.println(r*10);
			}

			System.out.println("sizde =" +l2.size());

	}

}
