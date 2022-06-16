//WAP to accept a no from user and find out sum of digit use (do while loop)
import java.util.*;
public class wap12 {
    public static void main(String[] args) {
        
        int num,r,sum=0;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter a number ");
        num = ch.nextInt();
        do{
            r=num%10;
            sum=sum+r;
            num=num/10;

        }
        while(num>0);
        System.out.println("The sum of digit is = "+sum);

        
    }
    
}
