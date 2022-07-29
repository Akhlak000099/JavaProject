//Write a program to accept basic details name , Phone No , Address , user Id and password from the user .throw an exception if 
//the user Id lenght is greater than 8 and password is not matched and should only contain the string value.

package AccessUserDetalis;

import java.util.Scanner;

public class access_data {
 static Scanner ch=new Scanner(System.in);
 public static int password_length=8;
 String name,add;
 long ph;
 private String password;
 private long userId;
 
 public long get_id() {
	 return userId;
 }
 public void  set_id(long userid) {
	 this.userId=userid;
	 System.out.println("User Id :"+userid);
	 
 }

 public String get_password() {
	 return password;
 }
 public void set_password(String password) {
	  this.password=password;
	  
 }
 
	
}
