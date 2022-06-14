// WAP to accept choice from thee user and according displa the output, (1-Even odd; 2-squre; 3-vowal or not (in switch case); 4-greater b/w three number).

import java.util.*;

// import javax.swing.DefaultBoundedRangeModel;
public class wap9 {
    public static void main(String[] args) {
      int choice,num1,a,b,c;
      char vowal;
      Scanner ch=new Scanner(System.in);
      System.out.println("Enter 1: Even or odd; 2:Squre; 3:vowal or not; 4:greater number beteew number");
      choice = ch.nextInt();
      switch(choice){
        // check which number is even or odd
        case 1:
            System.out.println("Chek your number is even or odd");
            num1 = ch.nextInt();
            if(num1%2==0){
                System.out.println("Your number is Even"+num1);
            }
            else{
                System.out.println("Your number is Odd"+num1);
            }
            break;
        //check the number if number is even or odd then waht is square of that  number    
        case 2:
           System.out.println("Check your number square ");
            num1 = ch.nextInt();
            if(num1%2==0){
                num1*=num1;
                System.out.println("The Square value is "+num1);
            }
            else{
                num1*=num1;
                System.out.println("The square value is "+num1);
            }
            break;
        //we are check the which character is vowal or
        case 3:
            System.out.println("check your character is vowal or not ");
            vowal = ch.next().charAt(0);
            switch(vowal){
                case 'a':
                    System.out.println("Your character is vowal "+vowal);
                    break;
                case 'e':
                    System.out.println("Your character is vowal "+vowal);
                    break;
                case 'o':
                    System.out.println("Your character is vowal "+vowal);
                    break;
                case 'u':
                    System.out.println("Your character is vowal "+vowal);
                    break;
                case 'i':
                    System.out.println("Your character is vowal "+vowal);
                    break;
                default:
                    System.out.println("Your character is constent "+vowal);
            }
            break;
        // We are check the greater number between three number   
        case 4:
            System.out.println("Enter any three number for check which is greater than b/w three number ");
            a=ch.nextInt();
            b=ch.nextInt();
            c=ch.nextInt();
            if(a>b && a>c){
                System.out.println("A is greater than b and c ="+a);
            }
            else if(b>a && b>c){
                System.out.println("B is greater than a and c ="+b);
            
            }
            else{
                System.out.println("C is greater than a and b ="+c);
            
            }
            break;
            
      }             
    }
}
