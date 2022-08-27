//Q2) Write a program to accept name from the user accordingly create the file,
//the no of file creation will bw depend upon thw user.Accept the data from the user 
//and store the data from the file which is selected by the user, and also perform the delete opetaion using file.

package fileHandlingProgram;

import java.io.*;
import java.util.*;

public class FileHandlingByUser {
	 String f;
     String write;
	static Scanner ch=new Scanner(System.in);
	public  void createFile(String f) {
		this.f=f;
		File cf=new File("C:\\Akhlak\\"+f);
		
		try {
			cf.createNewFile();
			System.out.println("Your File is successfuly created ...");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public  void writeFile(String wr) throws IOException {
		File wf=new File("C:\\Akhlak\\"+wr);
		
		if(wf.exists()) {
		FileWriter wf1=new FileWriter(wf);
		System.out.println("Write here...");
		write=ch.nextLine();
		wf1.write(write);
		wf1.close();
		}
		else {
			System.out.println("Enter the please correct file name ");
		}
	}
	public void readFile(String rf) throws FileNotFoundException {
		
		File fr=new File("C:\\Akhlak\\"+rf);
		Scanner scan=new Scanner(fr);
		
		while(scan.hasNextLine())
		{
			String data=scan.nextLine();
			System.out.println(data);
			
		}
	}
	
	public void deleteFile(String df) {
		File fd=new File("C:\\Akhlak\\"+df);
		if(fd.exists()) {
			fd.delete();
			System.out.println("Your file is deleted successfuly");
		
		}
		else {
			System.out.println("Enter the please correct file name ");
		}

	}
	
	

	public static void main(String[] args) throws IOException {
		
		 FileHandlingByUser obj=new  FileHandlingByUser();
		// TODO Auto-generated method stub
	char ans;
	int i;
	String name;
//	do {
//		
//		System.out.println("Enter the option b/w in \n1 :Create File \n2:Write File \n3:Read File \n4: Delete File");
//		i=ch.nextInt();
//		switch(i) {
//		case 1:
//			 System.out.println("Enter the file name with extention witch you want to create file");
//			    name=ch.nextLine();
//			    obj.createFile(name);
//			    break;
//		case 2:
//		    System.out.println("Enter the file name with extention witch you want to write file");
//		    name=ch.nextLine();
//		    obj.writeFile(name);
//		    break;
//		case 3:
//		    System.out.println("Enter the file name with extention witch you want to read file ");
//		    name=ch.nextLine();
//		    obj.readFile(name);
//		    break;
//		case 4:
//		    System.out.println("Enter the file name with extention witch you want dalete");
//		    name=ch.nextLine();
//		    obj.deleteFile(name);
//		    break;
//		default:
//			System.out.println("Plz inout correct option ");
//	    }
//		System.out.println("You want to continue this process Y/N");
//		ans=ch.next().charAt(0);
//		
//	}while(ans=='y' || ans=='Y');
	
	
		System.out.println("Enter the file name with extention witch you want to create file");
	    name=ch.nextLine();
	    obj.createFile(name);
	    System.out.println("Enter the file name with extention witch you want to write file");
	    name=ch.nextLine();
	    obj.writeFile(name);
	    System.out.println("Enter the file name with extention witch you want to read file ");
	    name=ch.nextLine();
	    obj.readFile(name);
	    System.out.println("Enter the file name with extention witch you want dalete");
	    name=ch.nextLine();
	    obj.deleteFile(name);
	}

}
