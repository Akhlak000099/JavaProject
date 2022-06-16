//WAP in which you have to accept 10 numbers from the user and find out the greatest number.
import java.util.*;
public class Wap19 {
    public static void main(String args[]) 
    {
        arr_program();
        
    }
    public static void arr_program() {
        int i,max=0;
        int[] grn=new int[10];
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the ten number and check which one is grater then other "); 
        for(i=1;i<10;i++){
            grn[i]=ch.nextInt();
            max=grn[0];
            if(max<grn[i]){
                max=grn[i];
            }

        }
        System.out.println("the maximum number is :-"+max);
        
    }
    
}
