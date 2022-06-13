// WAP to accept selling price and cost price for user and find out profit or loss.

import java.util.Scanner;

public class wap7 {
    public static void main(String args[]){
        int cp,sp,pl;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the selling price ");
        sp = ch.nextInt();
        System.out.println("Enter the cost price ");
        cp=ch.nextInt();
        
        if(sp>cp){ 
            pl=sp-cp;
            System.out.println("Your profit is : "+pl);
        }
        else{
            pl=sp-cp;
            System.out.println("Your loss is : "+pl);
        }
                
    }
}
