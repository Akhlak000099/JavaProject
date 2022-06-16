//WAP to accept two no from user and do the process of swapping by using third variable and also with without using third variable ?

import java.util.*;
public class wap15 {
    public static void main(String args[]) {
        accept_value();
        
    }
    public static void accept_value() {
        Scanner ch= new Scanner(System.in);
        System.out.println("Enter two number for swapping to each other ");
        int num1,num2;
        System.out.println("Enter num1 value");   
        num1=ch.nextInt();
        System.out.println("Enter num2 value");   
        num2=ch.nextInt();
        swapping(num1,num2);
        System.out.println("The two number is swap without using third value");
        swapping2(num1,num2);


    }
    public static void swapping(int num1,int num2) 
    {
        int c;
        c=num1;
        num1=num2;
        num2=c;
        System.out.println("num2: "+num2+" num1 "+num1);   
    }
    // Thw two number is swaping without third number
    public static void swapping2(int n1,int n2) 
    {
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("num2: "+n2+" num1 "+n1);   
    }

    
}
