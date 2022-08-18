//Write a program to accept full name form the user and display the 
//abbreviations of the first and middle names except the last name 
//which is displayed as it is. EG: Name:Manoj Rakesh Gupta  . (M.R.Gupta)
package program8;

import java.util.Scanner;

public class Nameing_program {
static String fname;
static String lname;
static String surname;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);


		System.out.println("Enter your fisrst name :");
		fname=ch.next();
		System.out.println("Enter your last name :");
		lname=ch.next();
		System.out.println("Enter your Surname :");
		surname=ch.next();
		
		char f=upperletter(fname);
		char l=upperletter(lname);
		System.out.println(f+"."+l+"."+surname);
		
	}
	public static char upperletter(String c) {
		char convert=c.charAt(0);
		
		char TakeLetter = Character.toUpperCase(convert);
		
		return TakeLetter;
	}
	


}
