import java.util.*;
public class logicals{
    public static void main(String args[]) {
        int num1,num2;
        Scanner op = new Scanner(System.in);
        System.out.println("Enter two number :");
        num1 = op.nextInt();
        num2 = op.nextInt();
        
        System.out.println(num1>12 || num2<12);
       
        System.out.println(num1>12 && num2<12);
        
        // System.out.println(num1>12 ! num2<12);
        
        
    }
}
