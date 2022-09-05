//Q3: Write a program to accept N User details Name, No , Address, email , UserID , Password 
//.Store user ID and password in the file .Accept  a  userID from the user and delete that record from the file.
package program10;

import java.io.*;
import java.util.*;

public class userData {
    String f,delete,write;
    static Scanner ch=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		userData file=new userData();
//		System.out.println("Enter your file name");
//		name=ch.nextLine();
//	    file.createfile(name);
//	    
//	    System.out.println("Enter your file name for write that file");
//		name=ch.nextLine();
//	    file.writefile(name);
//	    
	    System.out.println("Enter your file name for  read that file");
		name=ch.nextLine();
	    file.readfile(name);
	    
	    System.out.println("Enter your file name for delete record from that file");
		name=ch.nextLine();
	    file.deleterecord(name);
	    

		
	    System.out.println("Enter your file name for  read that file");
		name=ch.nextLine();
	    file.readfile(name);
	    
	}
	
	public void createfile(String f){
		this.f=f;
		File cf=new File("C:\\Akhlak\\"+f);
		try {
			if(cf.exists()) {
				System.out.println("File is already saved");
			}
			else {
				
				cf.createNewFile();
				System.out.println("File Created successfuly");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writefile(String f) {
		
		String name,email,address,userId,password;
		
		
		
		this.f=f;
	    File wf=new File("C:\\Akhlak\\"+f);
	    try {
	    	if(wf.exists()) {
	    		FileWriter wf1= new FileWriter(wf,true);
	    	
	    		PrintWriter pr = new PrintWriter(wf1);

	    		System.out.println("Enter your name ..");
	    		name=ch.nextLine();
	    		System.out.println("Enter your email ..");
	    		email=ch.nextLine();
	    		System.out.println("Enter your address ..");
	    		address=ch.nextLine();
	    		System.out.println("Enter your UserID ..");
	    		userId=ch.nextLine();
	    		System.out.println("Enter your Password ..");
	    		password=ch.nextLine();
	    		
//	    		wf1.write(write);
	    		
	    		pr.println("\n"+userId+", "+name+", "+email+", "+address+", "+password);
                pr.close();
	    		wf1.close();
	    		
	    	}
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	}
	public void readfile(String f) throws FileNotFoundException {
		this.f=f;
		File rf=new File("C:\\Akhlak\\"+f);
		
		Scanner scan=new Scanner(rf);
		
		while(scan.hasNext()) {
			
		 String data=scan.nextLine();
		 System.out.println(data);
		 
		}
	}
	
	public void deleterecord(String f) throws IOException {
		this.f=f;
		
		File rf=new File("C:\\Akhlak\\"+f);
		File temp_file=new File("C:\\Akhlak\\demo.txt");
		
		BufferedReader my_Reader=new BufferedReader(new FileReader(rf));
		BufferedWriter my_writer=new BufferedWriter(new FileWriter(temp_file));
		
		System.out.println("Enter Here Your userID ");
		String lineToRemove=ch.nextLine();
		
		String currentLine;
		
		while((currentLine=my_Reader.readLine()) !=null) {
			
			String trimmedLine=currentLine.trim();
			if(trimmedLine.equals(lineToRemove)) {
				continue;
			}
			my_writer.write(currentLine+System.getProperty("line.separator"));
			
		}
		my_writer.close();
		my_Reader.close();
		boolean is_success=temp_file.renameTo(rf);

	}
}
