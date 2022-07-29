package AccessUserDetalis;

public class get_data extends access_data{

	public static void main(String args[]) {
		get_data obj=new get_data();
		obj.user_details();
	}

long id;
  String pass;
  
		public void user_details() {
			System.out.println("Enter the Details Here.");
			System.out.print("Enter your Name : ");
			name = ch.next();
			
			System.out.print("Enter your Phone No  : ");
			ph = ch.nextLong();
			
			System.out.print("Enter your Address : ");
			add = ch.next();
			
			UserId();
		}
		
		public void UserId() {
			System.out.println("Enter your user id :");
			try {
				id=ch.nextLong();
				
				set_id(id);
				
				if(id == 8) {
					throw new exceptionClass("Enter the valid id here ");					
				}
				else {
					Password();
				}
			}
			catch(Exception e) {
				System.out.println(e);
				System.err.println("The ID Shoud be maximun 6 length.");
				System.exit(0);
			}
		}
		 
		//numeric value catch method
		
		public static boolean is_Numeric(char ch) {

		        return (ch >= '0' && ch <= '9');
		    }
		 
		// character value catch method
		public static boolean is_Letter(char ch) {
//	        ch = Character.toLowerCase(ch);
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }
		// check the password is valid and no valid
		public static boolean valid_password(String password) {
			int char_count=0;
			int num_count=0;
			if(password.length()<password_length) {
				return false;								
			}
			else if(password.length()==password_length) {
				for(int i=0;i<password.length();i++) {
							
				char cha=ch.next().charAt(i);
				
				
				if(in_Numric(cha)) {
					num_count++;
				}
				else if(is_Letter(cha)) {
					char_count++;
				}
				else 
				{
					return false;
				}
			}
			}
			else {
			return false;
	     	}
	
			return (char_count>=2 && num_count>=2);
		}

		private static boolean in_Numric(char cha) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public void Password() {
			System.out.print("1. A password must have at least eight characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n"); 
	               pass = ch.next();
//	               set_password(pass);
	               try {
	            	   if(valid_password(pass)) {
	            		   System.out.println("Password is valid... "+pass);
	            		   showing();
	            	   }
	            	   else {
	            		   throw new exceptionClass("not a valid password....");
	            	   }
	            	   
	               }
	               catch(Exception e2) {
	            	   System.out.println(e2);
	               }
		}
		public void showing()
		{
			System.out.println("Your Name : "+name);
			System.out.println("Your Phone No : "+ph);
			System.out.println("Your Address : "+add);
			System.out.println("Your Id : "+get_id());
			System.out.println("Your Password : "+get_password());
			
		}
				
}
