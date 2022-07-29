package PasswordValidation;

import java.util.Scanner;

public class AcceptIdPassword {
private int password_length=10;
String pass,id;
private String password,userid;

Scanner ch=new Scanner(System.in);

public static void main(String args[]) {
	AcceptIdPassword obj=new AcceptIdPassword();
	obj.accept();
}
//access user id and password from user
public void accept() {
	System.out.println("Enter 6 digit UserID :");
	id=ch.next();
	try {
		
		if(id.length()!=6) {
			throw new Exception("Enter valide UserID here...");
		}
		else {
			System.out.println("Enter Your password here...");
			Password();
		}
	}
	catch(Exception e) {
		System.out.println("Exception is "+e);
		System.out.println("Reinter your Id and Id shuld be maximum 6 digit");
	}
	
}
//it checking UpperCase value in password
public boolean UpperLetter(char cha) {
		cha = Character.toUpperCase(cha);
		return (cha>='A' && cha<='Z');
}

//it checking LowerCase value in password
public boolean LowerLetter(char cha) {
	cha=Character.toLowerCase(cha);
	return (cha>='a' && cha<='z');
  }
//it checking numeric value in password
public boolean Numeric(char cha) {
	return(cha>='0' && cha<='9');
}

public boolean valid_password(String pass) {
	int char_count=0;
	int num_count=0;

	if(pass.length()<password_length) {
		return false;
	}
	else {
		
		for(int i=0;i<pass.length();i++) {
			char cha;
			cha=pass.charAt(i);
			if(Numeric(cha)) {
				num_count++;
			}
			//Condition of UpperCase
			else if(UpperLetter(cha)) {
				char_count++;
			}
			//Condition of LowerCase 
			else if(LowerLetter(cha)) {
				char_count++;
			}
			//Condition of Special character and space  
			else if(pass.contains("!") ||pass.contains(" ") || pass.contains("@") || pass.contains("#") || pass.contains("$") || pass.contains("%")	|| pass.contains("^") || pass.contains("&") || pass.contains("*") || pass.contains("(") || pass.contains(")"))
			{
				return false;
			}
			
		}
	}

return (char_count >=2 && num_count>=2);
 }
//get the password from user
public void Password() {
	System.out.println("Password should not contain any space.\r\n"
			+ "Password should contain at least one digit(0-9).\r\n"
			+ "Password length should be between 8 to 15 characters.\r\n"
			+ "Password should contain at least one lowercase letter(a-z).\r\n"
			+ "Password should contain at least one uppercase letter(A-Z).\r\n"
			+ "Password should contain at least one special character ( @, #, %, &, !, $, etc….).");
	
	pass=ch.next();
	try {
	if(valid_password(pass)) {
		this.password=pass;
		this.userid=id;
		System.out.println("Your Id : "+id);
		System.out.println("Your Password : "+password);
		System.out.println("Your passwrod is valid :-)");
	}
	else {
		throw new Exception("Not a valid Password");
	}
	
  }
	catch(Exception e) {
		System.out.println(e);
	}
}

}
