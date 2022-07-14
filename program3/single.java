package program3;
// WAP to create a class which contain the method Palindrom .the second class will use the proerty of first class and display the output."
import java.util.Scanner;

public class single{
int r,sum=0,temp,num,n;    
Scanner ch=new Scanner(System.in);

  public void accept(int n) {
	  
      temp=n;    
      while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
      }    
      if(temp==sum)    
         System.out.println("palindrome number ");    
      else    
         System.out.println("not palindrome");    
  }
}
