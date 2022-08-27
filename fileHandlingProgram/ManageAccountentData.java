//Q1)Write a Java Program to Create a new text file and read the input from the user Name,
//Phone No, Bank name , Account No, Type of Account ,Amount for FD, Duration for FD , 
//Calculate the amount and display the final amount. Save the input in the text file and also store the FD imformation ?

package fileHandlingProgram;

import java.io.*;
import java.util.*;

public class ManageAccountentData {
static Scanner ch=new Scanner(System.in);
	
	public ManageAccountentData() {
		File cf=new File("C:\\Akhlak\\user.txt");
		try {
			cf.createNewFile();
			System.out.println("Your file is created");
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void Write_user() throws IOException {
		 String username,typeAccount,bankname;
		 long ph_no,AcNo,amountForFD,durationForFD;
		 
		 int intrest;
		 
		 System.out.println("Enter your bank name ");
		 bankname=ch.nextLine();
		 System.out.println("Enter your  username");
		 username=ch.nextLine();
		 System.out.println("Enter your Account Number ");
		 AcNo=ch.nextLong();
		 System.out.println("Enter your Type of Account :- Saving/Currant");
		 typeAccount=ch.next();
		 System.out.println("Enter your Phone Number ");
		 ph_no=ch.nextLong();
		 System.out.println("Enter your Amount of FD ");
		 amountForFD=ch.nextLong();
		 System.out.println("Enter year of duration For FD ");
		 durationForFD=ch.nextLong();

		 System.out.println("Write the intrest on Amount For Fd");
		 intrest=ch.nextInt();
		 
		 double total;
		 total=(amountForFD*intrest*durationForFD)/100;
		 File wf=new File("C:\\Akhlak\\user.txt");
		
		FileWriter fw1=new FileWriter(wf);
		
		fw1.write("Bank Name :- "+bankname + " \n "+"UserName :- "+ username+ " \n "+"Account Number :- "+AcNo+ " \n "+"Type of Account :- "+typeAccount+ " \n "+"Phone Number :- "+ph_no+ " \n "+"Amount For Fd :- "+amountForFD+ " \n "+"Duration For Fd in year:- "+durationForFD+"\n"+"Total intrest on your Amount For FD :- "+total );
		
		fw1.close();
		System.out.println("Successfuly write data");
		
		
	 
		 
	}
	public static void read_user() throws FileNotFoundException {
		File rf=new File("C:\\Akhlak\\user.txt");
		Scanner sc=new Scanner(rf);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
			
		}
	}
	
	public static void main(String [] args) throws IOException {
		new ManageAccountentData();
		
		Write_user();
		read_user();
		
	}
}
