package AgeValidation;

import java.util.Scanner;

public class Age {
	Scanner ch=new Scanner(System.in);
   private int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Age obj=new Age();
     obj.age();
	}
	public void check_age(int age){
		this.age=age;
		if(age<18) {
			throw new ArithmeticException("\nInvalid age...\nAge should be greater than 18");
		}
		else {
			throw new ArithmeticException("\nValid Age...\nYou can do vote because you are 18+");
		}
	}
	public void age() {
		try {
			System.out.println("Enter your age :");
			age=ch.nextInt();
			check_age(age);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
