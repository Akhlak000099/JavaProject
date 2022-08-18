package program8;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new RemoveChar();
	}

	Scanner sc = new Scanner(System.in);
	String str;
	char c;
	int i,j,count;
	
    RemoveChar(){
    	
		System.out.print("Enter a String here : ");
		str = sc.nextLine();
		System.out.print("Enter a Character : ");
		c = sc.next().charAt(0);
		str = str.toLowerCase();
		char[] t = str.toCharArray();
		for(i=j=0; i<str.length(); i++)
		{
			if(t[i] != c)
			{
				t[j++] = t[i];
			}
			else 
				count++;
		}
		while(count>0)
		{
			t[j++] = '\0';
	        count--;
		}
		System.out.println(t);
		
	}
	
	
}
