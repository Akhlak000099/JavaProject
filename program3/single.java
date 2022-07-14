package program3;

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
