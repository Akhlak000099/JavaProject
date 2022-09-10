//write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
//Accept name from the user and remove all the data from the list and display the output. and also perform the searching operation with the help of the name.
package CollectionProgram;

import java.util.*;

public class AcceptDataByUser {
Scanner ch=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		AcceptDataByUser obj=new AcceptDataByUser();
		
		obj.Accept();
	}
	public void Accept() {
		ArrayList<Demo2> list=new ArrayList<Demo2>();
	

		String name,email,percentage;
		long phNo;
	    String ans,uname;
		
		do {
			System.out.println("Enter your name ");
			name=ch.next();
			System.out.println("Enter your Email ");
			email=ch.next();
			System.out.println("Enter the  Student Percentage " );
			percentage=ch.next();
			System.out.println("Enter your Phone Number ");
			phNo=ch.nextLong();
			
			list.add(new Demo2(name,email,percentage,phNo));
			
			System.out.println("Will continue this procss type yes/no");
			ans=ch.next();
		}while(!ans.equalsIgnoreCase("No"));
			
			for(Demo2 str:list) {
				System.out.println(str);
			}
            
			System.out.println("Enter the name for remove it");
			uname=ch.next();
			
			for(Demo2 str2:list) {
				if(str2.name==uname) {
					int a=str2.name.indexOf(uname);
					list.remove(a);
					System.out.println("Name : "+str2.name);
					System.out.println("Email : "+str2.email);
					System.out.println("percentage : "+str2.per);
					System.out.println("Phone number : "+str2.phNo);
					System.out.println(str2);
				}
			}
			
			System.out.println("Enter the name for search it");
			uname=ch.next();
			
			for(Demo2 str2:list) {
				if(str2.name==uname) {
					int a=str2.name.indexOf(uname);
					list.get(a);
					System.out.println("Name : "+str2.name);
					System.out.println("Email : "+str2.email);
					System.out.println("percentage : "+str2.per);
					System.out.println("Phone number : "+str2.phNo);
					System.out.println(str2);
				}
			}
			
			
	}

}
