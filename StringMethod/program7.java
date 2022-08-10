//Write a program using string builtin function where you have to implement something by using the functions
package StringMethod;

import java.util.Scanner;

public class program7 {
	

	static String sr1;
	static String sr2;
	static int res;
	static Scanner ch=new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			
		}

		public static void demo() {
			String name="Akhlak";
			String obj=new String("Akhlak");
			System.out.println(name);
			System.out.println(obj);
			}
		public static void demo2(){
			System.out.println("Enter first value");;
		    sr1=ch.next();
		    System.out.println("Enter second value");;
		    sr2=ch.next();
		    res=sr1.compareTo(sr2);
		    System.out.println("The res value is "+res);
		    if(res==0) {
		    	System.out.println("both are equal");
		    }
		    else {
		    	System.out.println("both are different ");;
		    }
		}
		
		public static void demo3()
		{
	      System.out.println("Enter s1 value in string ");
	      sr1=ch.next();
			
			String[] s2=sr1.split(" ");
			for(String s4:s2) {
				System.out.println(s4);
			}
		}
		public static void demo4() {
			sr1=ch.next();
			System.out.println("Repalce "+sr1.replace('a', 'b'));
		}
		public static void demo5() {
		sr1=ch.next();	
		 boolean res1=sr1.contains("ab");
		 System.out.println("The result of contains method ="+res1);
		}
		public static void demo6() {
		sr1=ch.next();
		res=sr1.indexOf('i',3);
		System.out.println("The location of i:"+res);
		}
		public static void demo7() {
			System.out.println("Enter first value");;
		    sr1=ch.next();
		    System.out.println("Enter second value");;
		    sr2=ch.next();
			String sr3=sr1.concat(sr2);
			System.out.println(sr3);
			String demo_str="hello"+32+33+"ab"+67+97;
			String demo_str2="23"+56+65+76+"a";
			System.out.println(demo_str+" "+demo_str2);
		}
	}
