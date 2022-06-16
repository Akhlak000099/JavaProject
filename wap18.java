//WAP to accept a no from user and check it is palindrom or not 
import java.util.Scanner;
public class wap18 {
     public static void main(String args[]){  
        int r,sum=0,temp;    
        int n;
        Scanner ch=new Scanner(System.in);
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
