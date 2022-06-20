//Write a program by using class and object.First class do the process of sum of digit and fibonacci series Second class use the method of first class.
import java.util.*;
public class wap20 {
    
    public static void sumdigit(int num) {
        int r,sum=0;
        Scanner ch=new Scanner(System.in);
        // for(int i=0;i<num;i++)
        do{
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        while(num>0);
        System.out.println("the sum of digit is "+sum);
        
    }
    public static void fibonacci(int x) {
        int a=0,b=1;
        int i,sum;
        System.out.println(a);
        System.out.println(b);
        for(i=1;i<x-1;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
 }

 public static void choose() {
    int num,n;
    Scanner ch=new Scanner(System.in);
    System.out.println("Enter 1: for sumdigit and 2: for fibonacci");
    num =ch.nextInt();
    switch(num){
        case 1:
            System.out.println("Enter the value for sum ");
            n=ch.nextInt();
            sumdigit(n);
            break;
        case 2:
             System.out.println("Enter the value for fibonacci ");
             n=ch.nextInt();
             fibonacci(n);
             break;
        default:
              System.out.println("you input Invalid value");

    }    
 }

}