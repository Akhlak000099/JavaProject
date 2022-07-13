package Abstraction;

import java.util.Scanner;

public class accept
{
	Scanner ch=new Scanner(System.in);
	int r,sum=0,temp,n;   
	int f=1,size,i,j,gt,num1;
	
	public int[] accept_value() {
		System.out.println("Enter the size");
		size=ch.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter "+size+" numbers :");
		for(i=0;i<size;i++)
		{
			arr[i]=ch.nextInt();
		}
		return arr;
	}

}
