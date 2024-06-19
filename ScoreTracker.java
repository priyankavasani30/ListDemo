package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTracker {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter total Element:");
	        int n = scanner.nextInt();

	       
	        ArrayList<Integer> scores = new ArrayList<>();
	        System.out.println("Enter elements in the ArrayList:");
	        for (int i = 0; i < n; i++) {
	            int score = scanner.nextInt();
	            
	            scores.add(score);
	        }

	       
	        System.out.println("ArrayList Elements:");
	        for (int score : scores) {
	            System.out.println(score);
	        }

	        
	        scanner.close();
	}

}
