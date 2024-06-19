package listexamples;

import java.util.*;

public class VectorExample {
	
	public static void main(String[] args) {

	List<String> v1 = new Vector<String>(40);
	v1.add("Blue");
	v1.add("Black");
	v1.add("Green");
	
	System.out.println(v1);
	
	/*Iterator i=v1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}*/
	 
	 v1.forEach(v -> System.out.println(v));
	}

}
