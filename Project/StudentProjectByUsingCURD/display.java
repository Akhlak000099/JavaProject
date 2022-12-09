package StudentProjectByUsingCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class display {

	public static void show() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/studentdetails";
		String user = "root";
		String pass = "root";
		
		
		 
			String sh = "select * from studentdetails.detail";
			Connection con =DriverManager.getConnection(url,user,pass);
			PreparedStatement ps1 = con.prepareStatement(sh);

			ResultSet rst = ps1.executeQuery();
			System.out.println("Name\t\tPhone\t\tEmail\t\tGender\t\tCourse\t\tFees\n");
	        while(rst.next()) {
	        	System.out.println();
	        
	           System.out.print("\t\t"+rst.getString(1)+",");
	           System.out.print("\t\t"+rst.getString(2)+",");
	           System.out.print("\t\t"+rst.getString(3)+",");
	           System.out.print("\t\t"+rst.getString(4)+",");
	           System.out.print("\t\t"+rst.getString(5)+",");
	           System.out.print("\t\t"+rst.getString(6));
	           System.out.println();
	           
	        }
			ps1.close();
			con.close();

	}
	public static void main(String[] args) throws Exception {
		show();
	}
	
}
