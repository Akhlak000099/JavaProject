package Abstraction;

import java.util.Scanner;

public abstract class abs_class extends accept {
     Scanner ch=new Scanner(System.in);
     
     public abstract void demo1();
     
     public void plindrom() {
         System.out.println("Enter a number");
         n=ch.nextInt();
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
