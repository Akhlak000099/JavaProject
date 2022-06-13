// WAP a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle

import java.util.Scanner;

public class wap6 {
    public static void main(String args[]){
        int l,b;
        double cr,pr;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the length ");
        l=ch.nextInt();
        System.out.println("Enter the breath ");
        b=ch.nextInt();
        cr = l*b;
        System.out.println("The calculate area of rectangle is "+cr);
        pr= (l+b)*2;
        System.out.println("The perimeter of rectangle is "+pr);
    }
}
