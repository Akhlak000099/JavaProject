//Write a program by using constructor Create a class which implement the process of greater between 5 No 
import java.util.*;
public class wap21 {
    
    wap21(int a,int b,int c, int d, int e) { //it is a Constructor 

        if(a>b && a>c && a>d && a>e){
            System.out.println("A is greater than form b,c,d,or e");
        }
        else if(b>a && b>c && b>d && b>e){
            System.out.println("B is greater than form a,c,d,or e");
        }
        else if(c>a && c>b && c>d && b>e){
            System.out.println("C is greater than form a,b,d,or e");
        }
        
        else if(d>a && d>c && d>b && d>e){
            System.out.println("D is greater than form a,b,c,or e");
        }
        
        else{
            System.out.println("E is greater than form a,b,c,or d");
        }

    }
}
