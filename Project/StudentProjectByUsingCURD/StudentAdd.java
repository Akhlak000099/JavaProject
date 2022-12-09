package StudentProjectByUsingCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentAdd extends student {

	public StudentAdd() throws SQLException {
		super(name, ph,email,gender,course,fee);
		// TODO Auto-generated constructor stub
	
	}
	
	public static void Add() throws Exception {
		char s;
		do {
			String url = "jdbc:mysql://localhost:3306/studentdetails";
			String user = "root";
			String pass = "root";
			
			Scanner ch=new Scanner(System.in);
			System.out.println("student name :");
			name = ch.nextLine();
			
			System.out.println("student ph. number :");
			ph = ch.nextLine();
			
			System.out.println("student email :");
			email = ch.nextLine();

			System.out.println("student gender :");
			gender = ch.nextLine();
			
			System.out.println("student course :");
			course = ch.nextLine();
			
			System.out.println("student fees :");
			fee = ch.nextLine();
			
			String query = "insert into studentdetails.detail(name,ph,email,gender,course,fee) values(?,?,?,?,?,?)";

			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,name);
			ps.setString(2,ph);
			ps.setString(3,email);
			ps.setString(4, gender);
			ps.setString(5, course);
			ps.setString(6, fee);
			
			
			System.out.println("You Inserted Student Details is :\n\t"+"Student Name : "+name+"\n\tStudent Phone Number : "+ph+"\n\tStudent Email : "+email+"\n\tStudent course : "+course+"\n\tStudent fees : "+fee);
			
			int res = ps.executeUpdate();
			System.out.println("Result : "+res);
			ps.close();
			con.close();
			
			System.out.println("Would you like to continue this procsses so press Y / N");
			s=ch.next().charAt(0);
		}while(s=='y' || s=='Y');
		System.out.println("Thank You For Adding Student Details :-)");
			
	}
	

}
