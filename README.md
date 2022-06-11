# JavaProject
import java.util.*;
public class arithmetic{
    public static void main(String args[]) {
        int num1,num2,res;
        Scanner op = new Scanner(System.in);
        System.out.println("Enter two number :");
        num1 = op.nextInt();
        num2 = op.nextInt();
        res = num1+num2;
        System.out.println("The total is = "+res);
        res = num1-num2;
        System.out.println("The total is = "+res);
        res = num1*num2;
        System.out.println("The total is = "+res);
        res = num1/num2;
        System.out.println("The total is = "+res);
        res = num1%num2;
        System.out.println("The total is = "+res);
        
        
    }
}
