package program4;

import java.util.Scanner;

public class fbcSeeries {
	int i,sum=0,a,b,temp,r,n;
	Scanner ch=new Scanner(System.in);	

	 public void demo(int x) {
	        
	        System.out.println("enter a minimum number ");
	        a=ch.nextInt();
	        System.out.println("enter b maximum number ");
	        b=ch.nextInt();
	        for(i=1;i<x-1;i++){
	            sum=a+b;
	            System.out.println(sum);
	            a=b;
	            b=sum;
	        }
	    }
}
