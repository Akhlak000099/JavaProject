//WAP to accept a no from user and find the factorial using while loop;
import java.util.*;

public class wap11 {
    public static void main(String args[]) {
        int fact = 1;  
        int i = 1;
        int num;  
  
        Scanner sc = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number whose factorial is to be found: ");  
        num = sc.nextInt();  
          
        //counting the factorial using while loop  
        while(i <= num ){  
            fact = fact * i;   
            i++; //increment i by 1   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }
    
}
