package bankproject;

import java.util.Scanner;

public class accept_value {
   Scanner ch=new Scanner(System.in);
   long ac,ph;
   protected int bank_bal=500;
   String acname;
   // we take bank details from user
   public void accept() {
	   System.out.println("Enter Account holder name :");
	   acname = ch.next();
	   
	   System.out.println("Enter account holder phoner number :");
	   ph =ch.nextLong();
	   
	   System.out.println("Enter Account number :");
	   ac=ch.nextLong();
	   
	   System.out.println("Name : "+acname);

	   System.out.println("Account Holder Phone Number : "+ph);

	   System.out.println("Account Number : "+ac);
	   
	   System.out.println("Your current account balance : "+bank_bal);
	   
   }
}
