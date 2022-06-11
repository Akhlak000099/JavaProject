import java.util.Scanner;

public class switchcase {
    public static void main(String args[]) 
    {
        int num1,num2,res;
        char op;
        Scanner ch=new Scanner(System.in);           
        System.out.println("Enter two number :");
        num1=ch.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        op = ch.next().charAt(0);
        num2=ch.nextInt();
        switch (op) {

            // performs addition between numbers
            case '+':
              res = num1 + num2;
              System.out.println(num1 + " + " + num2 + " = " + res);
              break;
      
            // performs subtraction between numbers
            case '-':
              res = num1 - num2;
              System.out.println(num1 + " - " + num2 + " = " + res);
              break;
      
            // performs multiplication between numbers
            case '*':
              res = num1 * num2;
              System.out.println(num1 + " * " + num2 + " = " + res);
              break;
      
            // performs division between numbers
            case '/':
              res = num1 / num2;
              System.out.println(num1 + " / " + num2 + " = " + res);
              break;
      
            case '%':
              res = num1 % num2;
              System.out.println(num1 + " % " + num2 + " = " + res);
              break;
            
            default:
              System.out.println("Invalid OPerator");
              
          }
      

        
    }
    
}
