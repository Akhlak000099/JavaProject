import java.util.Scanner;

public class wap4 {
    public static void main(String args[]){
        float pr,ri,time,calculate;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        pr=ch.nextFloat();
        System.out.println("Enter the rat of interest ");
        ri=ch.nextFloat();
        System.out.println("Enter the rat no of years ");
        time=ch.nextFloat();
        calculate = pr*ri*time/100;
        System.out.println("the calculat rat of interest is "+calculate);
    }
}
