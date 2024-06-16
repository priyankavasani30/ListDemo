package arraylist;

import  java.util.*;

public class ListExample {

	public static void main(String[] args)
	{
		List<Color> lis=new ArrayList<Color>();
		lis.add(new Color(1,"White"));
		lis.add(new Color(2,"Black"));
		lis.add(new Color(3,"Blue"));
		lis.add(new Color(4,"Green"));
		
		for(Color c:lis)
		{
			System.out.println(c);
		}
	}
}
