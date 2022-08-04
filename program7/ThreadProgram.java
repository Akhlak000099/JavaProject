//Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
//The threads should display the messages continuously till the user presses any key.
package program7;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class ThreadProgram extends Thread {
Scanner ch=new Scanner(System.in);
String str;
char close;
int i;
boolean  check=true;
public ThreadProgram(String s)
{
    this.str=s;  
}
public void run()
{
    while(check)
    { do {

    	System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str);
        System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority());
         
     
        	try
            {
                Thread.sleep(1000);
                
            }
            catch(InterruptedException ie)
            { 
                System.out.println(ie);
            }        
        	close = ch.next().charAt(0);
        
    }while(UpperLetter(close)||LowerLetter(close));
        
    }
}
//it checking UpperCase value in password
public boolean UpperLetter(char cha) {
		cha = Character.toUpperCase(cha);
		return (cha>='A' && cha<='Z');
}

//it checking LowerCase value in password
public boolean LowerLetter(char cha) {
	cha=Character.toLowerCase(cha);
	return (cha>='a' && cha<='z');
}
}

