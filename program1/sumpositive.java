package program1;
// Q2)Write a program to accpet the positive numbers  from user and display the sum of that numbers using loop.
import java.util.Scanner;

public class sumpositive
{
  int i,s=0,r,num;
  Scanner ch=new Scanner(System.in);  
  public static void main(String args[])
  {
	sumpositive obj=new sumpositive();
	obj.accept();
  }
  public void accept() 
  {
	  System.out.println("Enter a positive number ");
	  num=ch.nextInt();
	  if(num>0) {
		  do {
			  r=num%10;
			  s=s+r;
			  num/=10;
			  
		  }while(num>0);
		  System.out.println("The sum positive number is :"+s);
	  }
	  else {
		  System.out.println("You enter nagitive number ");
		  if(num<0) {
			  System.out.println("Try Again");
		  }
	  }
	  
  }
}


