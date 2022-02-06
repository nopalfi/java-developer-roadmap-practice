package prerequisites;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		double[] scores = {90.4, 78.9, 94.9, 86.5}; // This is how to initialize a single dimension array and assign values in it directly.
		String[] subjects = new String[4]; // This is how to initialize a single dimension array without assign any values inside it.
		
		System.out.println(Arrays.toString(scores)); // Using 'Arrays' class to prints out every single values inside an array.
		subjects = new String[]{"Math", "Science", "Chemical", "Art"}; // After initialize an empty array variable, you make a new object for String[] like this.
		System.out.println(Arrays.toString(subjects));
		
		for (int i = 0; i < scores.length; i++) { // To print all of these and combine all of these together, use for loop and concate it.
			System.out.println(subjects[i] + " = " + scores[i]);
		}
		
		
	}

}
