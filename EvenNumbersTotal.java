package evensum;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersTotal {

	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		System.out.println("List of numbers::");
		System.out.println(numbers);
		
		int total = 0;
		for(int num : numbers)
		{
			if(num%2==0)
			{
				total+=num;
			}
		}
		System.out.println("Total even number :"+total);
	}
}
