// Check which number is armstrong 
import java.util.*;
public class wap13 {
    public static void main(String args[]) 
    {
        int num,r;
        int sum=0;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=ch.nextInt();
        int input_num=num;
        do{
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;

        }
        while(num>0);
        if(sum==input_num){
            System.out.println("it is armstrong");

        }
        else{
            System.out.println("it is not armstrong");
        }

        
    }
    
}
