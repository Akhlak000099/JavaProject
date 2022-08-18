package program9;

import java.util.Scanner;

public class swapAndReverse {
   static String str1;

	String str2;

	static Scanner ch=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapAndReverse obj=new swapAndReverse();
		obj.swap();
//		System.out.println("Enter a word/letter");
//		str1=ch.nextLine();
//		obj.reverseWord(str1);
	}
	public void swap() {
		System.out.println("Enter a word/letter");
		str1=ch.nextLine();
		System.out.println("Enter a word/letter");
		str2=ch.nextLine();
		
		System.out.println("Before Swapping "+str1+" "+str2);
		
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());

		System.out.println("After Swapping "+str1+" "+str2);
		
		reverseWord(str1);

	}

	public void reverseWord(String str1){  
		
     char[] result=str1.toCharArray();
    StringBuilder sbv=new StringBuilder();
    
    sbv.append(str1);
    sbv.reverse();
    
    System.out.println("Reverse value: second value will reverse "+sbv);

}
}