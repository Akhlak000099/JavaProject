/*Write a program by using method overloadind 
Calculate ACir Arec Acyl ASqu ATri*/

package program6;

import java.util.Scanner;

public class demo1 {
	
	
public static void main(String args[]) {
	accept();
}
	

	
	
    static double area,pi=3.14;
	public static double Area(int r) 
	{
		area=pi*r*r;
		return area;
		
	}
	public static double Area(double w,int h) 
	{
		area=w*h;
		return area;
		
	}
	public static double Area(int r,double h) 
	{
		area=(2*22*(r + h))/7;
		return area;
		
	}
	public static double Area(float sqr) 
	{
		area=sqr*sqr;
		return area;
		
	}
	public static double Area(int b,int vh) 
	{
		area=b*vh/2;
		return area;
		
	}
	public static void accept() {
		Scanner ch=new Scanner(System.in);
		int i,j;
		double k;
		float sqr;
		System.out.println("Enter a number of area of circle");
		i=ch.nextInt();
		System.out.println("The area of circle  is :"+Area(i));
		
		System.out.println("Enter two number of area of rectangle ");
		k=ch.nextDouble();
		j=ch.nextInt();
		System.out.println("The area of rectangle  is :"+Area(k,j));
		
		System.out.println("Enter two number of area of Cylinder ");
		i=ch.nextInt();
		k=ch.nextDouble();
		System.out.println("The area of Cylinder  is :"+Area(i,k));
		
		System.out.println("Enter a number of area of square ");
		sqr=ch.nextFloat();
		System.out.println("The area of square  is :"+Area(sqr));
		
		

		
		
	}
	
	

}
