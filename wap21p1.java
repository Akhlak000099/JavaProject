// call constructor from wap21 page
import java.util.*;
public class wap21p1 {
    public static void main(String args[]) {
        int a,b,c,d,e; 
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter a value");
        a=ch.nextInt();
        System.out.println("Enter b value");
        b=ch.nextInt();
        System.out.println("Enter c value");
        c=ch.nextInt();
        System.out.println("Enter d value");
        d=ch.nextInt();
        System.out.println("Enter e value");
        e=ch.nextInt();
        wap21 obj=new wap21(a,b,c,d,e);
                
    }

    
}
