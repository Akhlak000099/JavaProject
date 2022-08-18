//Write a program to check if two strings are created with same character
package program9;

import java.time.Clock;
import java.util.Scanner;

public class checkstring {
	public static String commonChars(String str1, String str2) {
		StringBuilder commonChars = new StringBuilder();
 
		if (str1.length() > 0 & str2.length() > 0) {
			// We should iterate the smallest string in length.
			String toBeIterated = (str1.length() > str2.length() ? str2 : str1);
			// Once string to be iterated is finalized, get string to be checked
			String toBeChecked = toBeIterated.equals(str1) ? str2 : str1;
			System.out.println("String to be iterated: " + toBeIterated);
			System.out.println("String to be checked: " + toBeChecked);
 
			// Iterating a string char by char
			for (int i = 0; i < toBeIterated.length(); i++) {
				// Check for common char
				if (toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))) {
					// If contains append it to resultant string
					commonChars.append(Character.toString(toBeIterated.charAt(i)));
				}
			}
			return commonChars.toString();
		} else
			return "";
	}
 
	public static void main(String[] args) {
 
		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string");
 
		String string1 = sc.nextLine();
 
		System.out.println("Please enter the second string");
 
		String string2 = sc.nextLine();
 
		sc.close();
 
		System.out.println("Output is :" + commonChars(string1, string2));
	}
 
}