import java.util.Scanner;

public class wap5 {
    public static void main(String args[]){
        int ra;
        double cr,cs;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the radius ");
        ra=ch.nextInt();
        cr=Math.PI*ra*ra;
        System.out.println("The area of circle is "+cr);
        cs=2*Math.PI*ra;
        System.out.println("The circumstances of circle is "+cs);
    }
}
