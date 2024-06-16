package linklist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lst = new LinkedList<>();
		lst.add("Priyanka");
		lst.add("Maitri");
		lst.add("Jaineesh");
		lst.add("Tirth");
	
		System.out.println(lst);
		
		Iterator ir = lst.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	
		Collections.sort(lst);
		System.out.println(lst);
	}

}
