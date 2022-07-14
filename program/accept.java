package program;

import java.util.Scanner;

public class accept {
	int i,j,size,row,col;
	int[][] arr;

	
	Scanner ch=new Scanner(System.in);
	public int[][] accepvalue() 
	{
		System.out.println("Enter row numbeer : ");
		row = ch.nextInt();
		
		System.out.println("Enter col numbeer : ");
		col = ch.nextInt();
		
		arr=new int[row][col];
		System.out.println("the size of row : "+row+"and col is : "+col);
		
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{
				arr[i][j]=ch.nextInt();

			}

		}
		return arr;
	
	
}
}