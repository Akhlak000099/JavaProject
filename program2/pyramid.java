package program2;
// WAP to accept no rows from the user and accordingly display the pyramid.
import java.util.Scanner;
public class pyramid {
int k,i,j,num;

public static void main(String args[]) {
     pyramid obj=new pyramid();
     obj.accept();
} 

Scanner ch=new Scanner(System.in);
	public void accept() 
	{
		System.out.println("Enter a number ");
		num=ch.nextInt();
		 System.out.println("This is a pattern for using nested loop");

	        for(i=1;i<=num;i++){
	            for(k=num-1;k>=i;k--){
	                System.out.print(" ");
	            }
	            for(j=1;j<=i;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}
}
