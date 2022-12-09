package StudentProjectByUsingCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class studentUpdate  {

	public static void update() throws Exception {
		String stname;
		String stph;
		String stemail;
		
		
		Scanner ch=new Scanner(System.in);

		
		int choose;
		char s;
		do {
		System.out.println(" Press 1 for update name \n Press 2 for update phone number \n Press 3 for update Email ");
		
		System.out.println("Enter a number :");
		choose = ch.nextInt();
		
		switch(choose) {
		 case 1:
			 String url = "jdbc:mysql://localhost:3306/studentdetails";
				String user = "root";
				String pass = "root";
				
		
			System.out.println("Enter student ph. number");
			stph=ch.next();
		
			System.out.println("Enter update student name :");
			stname=ch.next();
			
			String query = " update studentdetails.detail set name = ? where ph= ?";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,stname);
			ps.setString(2,stph);
			
			int res = ps.executeUpdate();
			
			System.out.println("Result : "+res);
			ps.close();
			con.close();
			
			break;
		 
		 case 2:
			 String url1 = "jdbc:mysql://localhost:3306/student_data";
				String user1 = "root";
				String pass1 = "root";
				
			System.out.println("Enter update student phone number :");
			stph=ch.next();
			 
			 System.out.println("Enter student email :");
				stemail=ch.next();
				
				String query1 = " update studentdetails.detail set ph = ? where email= ?";
				
				Connection con1 = DriverManager.getConnection(url1,user1,pass1);
				PreparedStatement ps1 = con1.prepareStatement(query1);
				
				ps1.setString(1,stph);
				ps1.setString(2, stemail);
				
				int res1 = ps1.executeUpdate();
				
				System.out.println("Result : "+res1);
				ps1.close();
				con1.close();
				
			    break;
		
		 case 3:
			 String url3 = "jdbc:mysql://localhost:3306/student_data";
				String user3 = "root";
				String pass3 = "root";
				
			 System.out.println("Enter student ph. number :");
			 stph=ch.next();
			 
			 System.out.println("Enter update student email :");
				stemail=ch.next();
				
				String query3 = " update studentdetails.detail set email = ? where ph= ?";
				
				Connection con3 = DriverManager.getConnection(url3,user3,pass3);
				PreparedStatement ps3 = con3.prepareStatement(query3);
				
				ps3.setString(1,stemail);
				ps3.setString(1,stph);
				
				int res3 = ps3.executeUpdate();
				
				System.out.println("Result : "+res3);
				ps3.close();
				con3.close();
				
				break;
		default:
			System.out.println("your input wrong value :-)");
		 }
		
		System.out.println("Would you like to continue this procsses so press Y / N");
		s=ch.next().charAt(0);
	}while(s=='y' || s=='Y');
		
	System.out.println("Thank You For Using This Application");
}

}
